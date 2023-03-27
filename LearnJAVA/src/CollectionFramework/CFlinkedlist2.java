package CollectionFramework;

import java.util.*;

public class CFlinkedlist2 
{
    public static void main(String[] args) 
    {
        LinkedList ll1 = new LinkedList();

        ll1.add(100);
        ll1.add(200);
        ll1.add(300);
        ll1.add(200);  //duplicates are allowed

        System.out.println(ll1);

        // ll1.peek() we are unable to use this method when we are creating linked list object using parent class reference

        System.out.println(ll1.get(2));

        System.out.println(ll1.indexOf(200));
        System.out.println(ll1.lastIndexOf(200));
        System.out.println(ll1.getFirst());
        System.out.println(ll1.getLast());
         ll1.push(10);
        System.out.println(ll1);
        System.out.println(ll1.pop());
        System.out.println(ll1);

       
    }
}
