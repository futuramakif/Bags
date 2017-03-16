package Bags;

import BasicIO.*;

public class ConBag implements Bag
{
  String red, gold, purple, blue, orange, green, white;
  String[] bagArray;
  
  public ConBag()
  {
    bagArray = new String[100];
  }
  
  public ConBag( int p )
  {
    bagArray = new String[p];
  }
  
  public ConBag ( String[] par )
  {
    bagArray = new String[100];
    System.arraycopy(par, 0, bagArray, 0, par.length);
  }
  
  public String draw()
  {
    return "empty";
  }
    
  public int count( String item )
  {
    return 0;
  }

  public boolean contains( String item )
  {
    return true;
  }
  
  public int cardinality()
  {
    return 0;
  }
  
  public void remove( String item )
  {
    
  }
    
  public void add( String item )
  {
    ASCIIDataFile tokens;
    tokens = new ASCIIDataFile();
    
    item = tokens.readString();
    int numTokens = tokens.readInt();
  }
  
    public static void main ( String[] args ) 
  {
    ConBag s = new ConBag();
  }
}
