package myprediction;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;

public class J48Handler
{
  private String filePath;
  private File j48File;
  public ArrayList<String> attributes;
  ArrayList<J48Rule> rules;
  public boolean status = false;
  
  J48Handler(String fileName)
  {
    try
    {
      loadFile(fileName);
    }
    catch (Exception e)
    {
      e.printStackTrace();
      System.exit(1);
    }
  }
  
  public void loadFile(String fileName)
    throws Exception
  {
    this.attributes = new ArrayList();
    
    this.rules = new ArrayList();
    this.filePath = fileName;
    
    String classification = null;
    int ruleCount = 0;
    try
    {
      BufferedReader br = new BufferedReader(new FileReader(fileName));Throwable localThrowable2 = null;
      try
      {
        int lineNumber = 0;
        String line = null;
        boolean foundAttrSection = false;
        boolean foundRulesSection = false;
        do
        {
          line = br.readLine();
          if (line == null) {
            break;
          }
          lineNumber++;
        } while (!line.startsWith("Attributes:"));
        foundAttrSection = true;
        if (!foundAttrSection) {
          throw new Exception("Attribute section not found");
        }
        for (;;)
        {
          line = br.readLine();
          if (line == null) {
            break;
          }
          lineNumber++;
          if (!line.startsWith("              ")) {
            break;
          }
          this.attributes.add(line.replace("              ", ""));
        }
        if (this.attributes.size() == 0) {
          throw new Exception("No attributes in attribute section");
        }
        if (!Kmxd.ah.getAttrAsArrayList().containsAll(this.attributes))
        {
          System.out.println("Attribute mismatch");
          this.status = false; return;
        }
        do
        {
          line = br.readLine();
          if (line == null) {
            break;
          }
          lineNumber++;
        } while (!line.startsWith("------------------"));
         line = br.readLine();
        lineNumber++;
        if (line.replace("\\s", "").length() == 0) {
          foundRulesSection = true;
        } else {
          throw new Exception("Malformed rules section at line" + lineNumber);
        }
        if (!foundRulesSection) {
          throw new Exception("Rules section not found");
        }
        J48Rule thisRule = new J48Rule();
        
        int prevIndent = -1;
        for (;;)
        {
          boolean classOnLine = false;
          line = br.readLine();
          if (line == null)
          {
            classOnLine = true;
            break;
          }
          lineNumber++;
          if (line.replace("\\s", "").length() == 0) {
            break;
          }
          int indent = 0;
          while (line.startsWith("|   "))
          {
            indent++;
            line = line.replaceFirst("\\|\\s", "").trim();
            if (indent > this.attributes.size() * 3) {
              throw new Exception("Malformed rule on line " + lineNumber);
            }
          }
          int nextIndent = 0;
          br.mark(16383);
          String nextLine = br.readLine();
          while ((!classOnLine) && (nextLine.startsWith("|   ")))
          {
            nextIndent++;
            nextLine = nextLine.replaceFirst("\\|\\s", "").trim();
            if (nextIndent > Kmxd.ah.attributes.size() * 3) {
              throw new Exception("Malformed rule on line " + (lineNumber + 1));
            }
          }
          br.reset();
          if (indent > 1 + prevIndent) {
            throw new Exception("Malformed rule on line " + lineNumber);
          }
          if (nextIndent <= indent) {
            classOnLine = true;
          }
          if (classOnLine)
          {
            int lastColon = line.lastIndexOf(":");
            if (lastColon <= 0) {
              throw new Exception("Malformed rule on line " + (lineNumber + 1));
            }
            classification = line.substring(lastColon + 1, line.length()).trim();
            classification = classification.split(" ")[0];
            line = line.substring(0, lastColon);
          }
          while (thisRule.subRules.size() > indent) {
            thisRule.subRules.remove(thisRule.subRules.size() - 1);
          }
          thisRule.subRules.add(new J48SubRule(line, Kmxd.ah.attributes));
          if (classOnLine)
          {
            thisRule.classification = classification;
            System.out.println(thisRule.toString());
            this.rules.add(new J48Rule(thisRule));
            ruleCount++;
            classification = null;
          }
          prevIndent = indent;
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
    catch (Exception e)
    {
      e.printStackTrace();
      System.exit(1);
    }
    System.out.println("Rule count: " + ruleCount);
    this.j48File = new File(this.filePath);
    
    this.status = true;
  }
  
  public String getFileName()
  {
    return this.j48File.getName();
  }
  
  public String getAttrAsList()
  {
    String ret = "";
    for (String s : this.attributes) {
      ret = ret + s + ", ";
    }
    ret = ret.substring(0, ret.length() - 2);
    return ret;
  }
  
  public String getAttrAsArrayList()
  {
    String ret = "";
    for (String s : this.attributes) {
      ret = ret + s + ", ";
    }
    ret = ret.substring(0, ret.length() - 2);
    return ret;
  }
}
