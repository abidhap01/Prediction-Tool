package myprediction;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Statement;
import java.util.ArrayList;

public class ArffHandler
{
  private String fileName;
  private String relationName;
  ArrayList<ArffAttribute> attributes = new ArrayList();
  private String[][] instances;
  private int nInst;
  
  ArffHandler() {}
  
  public String getFileName()
  {
    return this.fileName;
  }
  
  public String getRelationName()
  {
    return this.relationName;
  }
  
  public String[][] getInstances()
  {
    return this.instances;
  }
  
  public int getNInst()
  {
    return this.nInst;
  }
  
  ArffHandler(String fileName)
    throws Exception
  {
    loadFile(fileName);
  }
  
  public void loadFile(String fileName)
    throws Exception
  {
    BufferedReader br = new BufferedReader(new FileReader(fileName));Throwable localThrowable2 = null;
    try
    {
      int lineNumber = 0;
      boolean inDataSection = false;
      Statement stmt = null;
      String[] instSplit;
      for (;;)
      {
        String line = br.readLine();
        if (line == null) {
          break;
        }
        lineNumber++;
        if ((line.length() != 0) && 
        
          (line.charAt(0) != '%'))
        {
          if ((line.charAt(0) == '@') && (inDataSection)) {
            throw new Exception("Error - header information in @data section");
          }
          if (line.startsWith("@relation "))
          {
            if (this.relationName == null) {
              this.relationName = line.substring(10, line.length());
            } else {
              throw new Exception("@relation appears twice");
            }
          }
          else if (line.startsWith("@attribute")) {
            try
            {
              this.attributes.add(new ArffAttribute(line));
            }
            catch (Exception e)
            {
              throw new Exception("line " + lineNumber + ": " + e.getMessage());
            }
          } else if (line.startsWith("@data ")) {
            inDataSection = true;
          } else if (inDataSection) {
            instSplit = line.split(",");
          }
        }
      }
    }
    catch (Throwable localThrowable1)
    {
      localThrowable2 = localThrowable1;throw localThrowable1;
    }
    finally
    {
      if (br != null) {
        if (localThrowable2 != null) {
          try
          {
            br.close();
          }
          catch (Throwable x2)
          {
            localThrowable2.addSuppressed(x2);
          }
        } else {
          br.close();
        }
      }
    }
  }
  
  public ArrayList<String> getAttrAsArrayList()
  {
    ArrayList<String> ret = new ArrayList();
    for (ArffAttribute s : this.attributes) {
      ret.add(s.name);
    }
    return ret;
  }
  
  public String getAttrAsList()
  {
    String ret = "";
    for (ArffAttribute s : this.attributes) {
      ret = ret + s.name + ", ";
    }
    ret = ret.substring(0, ret.length() - 2);
    return ret;
  }
  
  public ArffAttribute getAttribute(String name)
  {
    ArffAttribute ret = null;
    for (ArffAttribute a : this.attributes) {
       System.out.println("arrf handler : " + a);
      if (a.name.equals(name))
      {
        ret = a;
        break;
      }
    }
    return ret;
  }
}
