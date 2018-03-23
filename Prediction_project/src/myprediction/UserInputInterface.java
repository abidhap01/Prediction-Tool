package myprediction;

public abstract interface UserInputInterface
{
  public abstract String getAtrValue();
  
  public abstract String getAtrName();
  
  public abstract ArffAttribute.DataTypes getDataType();
}
