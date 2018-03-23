package myprediction;

import java.util.ArrayList;

public class J48SubRule
{
  String atName;
  CompOp op;
  String value;
  ArffAttribute.DataTypes dataType;
  
  static enum CompOp
  {
    GT,  LT,  GTE,  LTE,  EQ,  NEQ;
    
    private CompOp() {}
  }
  
  J48SubRule(J48SubRule sr)
  {
    this.atName = new String(sr.atName);
    this.op = sr.op;
    this.value = new String(sr.value);
    this.dataType = sr.dataType;
  }
  
  J48SubRule(String line, ArrayList<ArffAttribute> al)
  {
    boolean foundAttr = false;
    for (ArffAttribute at : al) {
      if (line.startsWith(at.name))
      {
        foundAttr = true;
        this.atName = at.name;
        this.dataType = at.dataType;
        
        line = line.substring(this.atName.length() + 1, line.length());
        String[] lineSplit = line.split("\\s");
        String lineOp = lineSplit[0];
        try
        {
          switch (lineOp)
          {
          case "=": 
            this.op = CompOp.EQ;
            break;
          case ">": 
            this.op = CompOp.GT;
            break;
          case ">=": 
          case "=>": 
            this.op = CompOp.GTE;
            break;
          case "<": 
            this.op = CompOp.LT;
            break;
          case "<=": 
          case "=<": 
            this.op = CompOp.LTE;
            break;
          case "!=": 
            this.op = CompOp.NEQ;
            break;
          default: 
            throw new Exception("Unknown operator: " + lineOp);
          }
        }
        catch (Exception e)
        {
          e.printStackTrace();
          System.exit(1);
        }
        line = line.substring(lineOp.length() + 1, line.length());
        this.value = line;
      }
    }
  }
  
  public String getAtName()
  {
    return this.atName;
  }
  
  public CompOp getOp()
  {
    return this.op;
  }
  
  public String getValue()
  {
    return this.value;
  }
}
