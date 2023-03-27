package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.SwingPropertyChangeSupport;

import ALLcode.all;

public class CFarraylist2
{
    public static void main(String[] args) 
    {
        ArrayList al1=new ArrayList();

        al1.add(100);
        al1.add(200);
        al1.add(300);
        System.out.println(al1);
        System.out.println(al1.contains(200));
        System.out.println(al1.indexOf(300));
        System.out.println(al1.size());
        al1.ensureCapacity(10);
        al1.trimToSize();
        al1.clear();
        System.out.println(al1);
        System.out.println("*************************************************************************");

        List al2=new ArrayList();
        al2.add(100);
        System.out.println(al2);
    }
}
   
