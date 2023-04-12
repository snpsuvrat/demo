package MapAndGenerics;

import java.util.ArrayList;
import java.util.Collections;

public class Generics04 
{
  public static void main(String[] args) 
  {
      ArrayList a1=new ArrayList();

      a1.add(20);
      a1.add(70);
      a1.add(60);
      a1.add(40);
      a1.add(30);

      System.out.println(a1);

      Collections.sort(a1);

      System.out.println(a1);

      ArrayList<String> a2=new ArrayList<String>();

      a2.add("Hyder");
      a2.add("Rohan");
      a2.add("RAj");
      a2.add("Aditya");
      a2.add("Brijesh");

      System.out.println(a2);

      Collections.sort(a2);

      System.out.println(a2);

      ArrayList a3=new ArrayList();

      a3.add(20);
      a3.add(70);
      a3.add(60);
      a3.add(40);
      a3.add(30);

      System.out.println(a3);

    //   Collections.sort(a3);

    //   int index=Collections.binarySearch(a3,30);   //it will work only if the collection is in sorted order  // if the the value is not present the output will be negative

    //   System.out.println("Index is " +index);
    
   // Collections.rotate(a3,3);
    
//    Collections.shuffle(a3);
   System.out.println(Collections.frequency(a3, 70));

  }   
}
