package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.*;

public class CfFailFastFailSafe 
{
   public static void main(String[] args) 
   {
    // ArrayList ar=new ArrayList();
    // ar.add(10);
    // ar.add(20);
    // ar.add(30);
    // ar.add(40);
    // System.out.println(ar);

    // //  for(int i=0;i<ar.size();i++)
    // //       {
    // //          System.out.println(ar.get(i));
    // //          ar.add(100);
    // //       }


    //   // FAil FAst
    //   Iterator itr=ar.iterator();
    //   while(itr.hasNext())
    //   {
    //      System.out.println(itr.next());
    //      ar.add(100);
    //   }
      
    //  //Fail Safe

      CopyOnWriteArrayList ar1=new CopyOnWriteArrayList();
      ar1.add(10);
      ar1.add(20);
      ar1.add(30);
      ar1.add(40);
      System.out.println(ar1);

      Iterator itr1=ar1.iterator();
      while(itr1.hasNext())
      {
         System.out.println(itr1.next());
         ar1.add(100);
      }

   }  
}
