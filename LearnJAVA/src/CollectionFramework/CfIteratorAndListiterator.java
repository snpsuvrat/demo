package CollectionFramework;
import java.util.*;

public class CfIteratorAndListiterator 
{
    public static void main(String[] args) 
    {
          ArrayList ar=new ArrayList();
          ar.add(100);
          ar.add(25);
          ar.add(50);
          ar.add(125);
          System.out.println(ar);

          //for loop
        //   for(int i=0;i<ar.size();i++)
        //   {
        //       //object o=ar.get(i);
        //       //System.out.println(o);
        //       System.out.println(ar.get(i));
        //   }

           // for each
        //    for(Object o:ar)
        //    {
        //     System.out.println(o);
        //    }

        Iterator itr=ar.iterator();
        while(itr.hasNext())
        {
           // int i=(int)itr.next();
            System.out.println(itr.next());
        }
          
        ListIterator  litr = ar.listIterator(ar.size());

        while(litr.hasPrevious())
        {
            System.out.println(litr.previous());
        }
       
    }
}
