package CollectionFramework;

import java.util.*;

public class CollectFrame1
{
    public static void main(String[] args) 
    {
       ArrayList al1=new ArrayList<>();

       al1.add(100);

       al1.add(200);

       al1.add(300);

       System.out.println(al1);
       System.out.println("*********************************************************");
     
       ArrayList al2=new ArrayList<>();

       al2.add("pw skills");

       al2.add(1);

       al2.add('j');

       al2.add("1.2");

       System.out.println(al2);

       al2.add(100);

       System.out.println(al2);
       
       System.out.println("*********************************************************");

       ArrayList al3=new ArrayList();

       al3.add(600);

       al3.add(700);

       al3.add(800);

       System.out.println(al3);

       al3.addAll(al2);

       System.out.println(al3);

       System.out.println("****************************************************************");

       al3.add(2, "pwskills");

       System.out.println(al3);

       al3.addAll(2, al1);

       System.out.println(al3);
    }
}