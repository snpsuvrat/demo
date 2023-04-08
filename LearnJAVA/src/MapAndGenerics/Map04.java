package MapAndGenerics;

import java.util.Hashtable;
import java.util.TreeMap;

public class Map04
{
  public static void main(String[] args) 
  {
     Hashtable ht=new Hashtable();          //synchronised thread but not in order of insertion ; cannot make a null key
     ht.put(1,"rohan");
     ht.put(2,"rohit");
     ht.put(3,"ramesh");
     ht.put(4,"rajesh");

     System.out.println(ht);
     
     System.out.println("***********************************************************************");

     TreeMap tm=new TreeMap();             // return values not in order of insertion but in sorted ascending order of given keys

     Integer i=new Integer(5);

    //  tm.put(i,"Raghav");
     tm.put(1,"rohan");
     tm.put(2,"rohit");
     tm.put(3,"ramesh");
     tm.put(4,"rajesh");

     System.out.println(tm);
  }   
}
