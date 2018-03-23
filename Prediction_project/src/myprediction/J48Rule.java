package myprediction;

import java.util.ArrayList;

public class J48Rule
{
  ArrayList<J48SubRule> subRules;
  String classification;
  
  J48Rule()
  {
    this.subRules = new ArrayList();
  }
  
  J48Rule(J48Rule rule)
  {
    this.subRules = new ArrayList();
    for (J48SubRule sr : rule.subRules) {
      this.subRules.add(new J48SubRule(sr));
    }
    this.classification = rule.classification;
  }
  
  private boolean subRuleMatch(J48SubRule instSubRule, J48SubRule modelSubRule)
  {
    boolean match = true;
    switch (modelSubRule.dataType)
    {
    case DATE: 
      throw new UnsupportedOperationException("Date datatype not implemented yet");
    case STRING: 
      switch (modelSubRule.op)
      {
      case EQ: 
        match = modelSubRule.value.equals(instSubRule.value);
        break;
      case GT: 
        throw new UnsupportedOperationException("Unimplemented comparison: 'String > String'");
      case GTE: 
        throw new UnsupportedOperationException("Unimplemented comparison: 'String => String'");
      case LT: 
        throw new UnsupportedOperationException("Unimplemented comparison: 'String < String'");
      case LTE: 
        throw new UnsupportedOperationException("Unimplemented comparison: 'String <= String'");
      case NEQ: 
        match = !modelSubRule.value.equals(instSubRule.value);
        break;
      default: 
        throw new UnsupportedOperationException("Unknown CompOp: " + modelSubRule.op);
      }
      break;
    case NUMERIC: 
      double iVal = Double.parseDouble(instSubRule.value);
      double rVal = Double.parseDouble(modelSubRule.value);
      switch (modelSubRule.op)
      {
      case EQ: 
        match = iVal == rVal;
        break;
      case GT: 
        match = iVal > rVal;
        break;
      case GTE: 
        match = iVal >= rVal;
        break;
      case LT: 
        match = iVal < rVal;
        break;
      case LTE: 
        match = iVal <= rVal;
        break;
      case NEQ: 
        match = iVal != rVal;
        break;
      default: 
        throw new UnsupportedOperationException("unknown CompOp: " + modelSubRule.op);
      }
      break;
    case NOMINAL: 
      switch (modelSubRule.op)
      {
      case EQ: 
        match = modelSubRule.value.equals(instSubRule.value);
        break;
      case GT: 
        throw new UnsupportedOperationException("Unimplemented comparison: 'Nominal > Nominal'");
      case GTE: 
        throw new UnsupportedOperationException("Unimplemented comparison: 'Nominal => Nominal'");
      case LT: 
        throw new UnsupportedOperationException("Unimplemented comparison: 'Nominal < Nominal'");
      case LTE: 
        throw new UnsupportedOperationException("Unimplemented comparison: 'Nominal <= Nominal'");
      case NEQ: 
        match = !modelSubRule.value.equals(instSubRule.value);
        break;
      default: 
        throw new UnsupportedOperationException("Unknown CompOp: " + modelSubRule.op);
      }
      break;
    default: 
      throw new UnsupportedOperationException("Unknown dataType: " + modelSubRule.dataType);
    }
    return match;
  }
  
  public boolean isContainedBy(ArrayList<String> inst)
  {
    boolean ret = true;
    for (J48SubRule tsr : this.subRules)
    {
      boolean found = false;
      for (String str : inst)
      {
        J48SubRule isr = new J48SubRule(str, Kmxd.ah.attributes);
        if (isr.atName.equals(tsr.atName))
        {
          if (!subRuleMatch(isr, tsr)) {
            break;
          }
          found = true; break;
        }
      }
      if (!found) {
        return false;
      }
    }
    return ret;
  }
}
