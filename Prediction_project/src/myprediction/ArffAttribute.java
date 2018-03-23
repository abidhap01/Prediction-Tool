package myprediction;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArffAttribute
{
  String name;
  String t;
  DataTypes dataType;
  ArrayList<String> nominals;
  String dateFormat;
  
  static enum DataTypes
  {
    NUMERIC,  NOMINAL,  STRING,  DATE;
    
    private DataTypes() {}
  }
  
  public ArffAttribute(String line)
    throws Exception
  {
    line = line.replaceAll("\\s+", " ");
    
    String[] attributeSplit = line.split("\\s");
    if ((attributeSplit[1] == null) || (attributeSplit[1].length() == 0)) {
      throw new Exception("Error - malformed attribute");
    }
    this.name = attributeSplit[1];
    if (attributeSplit[2].equals("numeric"))
    {
      this.dataType = DataTypes.NUMERIC;
    }
    else if (attributeSplit[2].equals("string"))
    {
      this.dataType = DataTypes.STRING;
    }
    else if (attributeSplit[2].equals("date"))
    {
      this.dataType = DataTypes.DATE;
      this.dateFormat = attributeSplit[3];
    }
    else if (attributeSplit[2].startsWith("{"))
    {
      this.dataType = DataTypes.NOMINAL;
      this.nominals = new ArrayList();
      this.t = line.substring(line.indexOf('{') + 1, line.indexOf('}'));
      this.t = this.t.replace("\\'", "");
      this.t = this.t.replace('\'', '"');
      
      Pattern p = Pattern.compile("(([^\"][^,]*)|\"([^\"]*)\"),?");
      Matcher m = p.matcher(this.t);
      while (m.find()) {
        if (m.group(2) != null)
        {
          System.out.println(m.group(2).replace("\n", ""));
          this.nominals.add(m.group(2).replace("\n", ""));
        }
        else if (m.group(3) != null)
        {
          System.out.println(m.group(3).replace("\n", ""));
          this.nominals.add(m.group(3).replace("\n", ""));
        }
      }
    }
    else
    {
      throw new Exception("Unknown data tye: " + attributeSplit[2]);
    }
  }
}
