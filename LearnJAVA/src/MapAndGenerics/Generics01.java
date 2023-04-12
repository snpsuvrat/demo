package MapAndGenerics;

import java.util.ArrayList;

public class Generics01 
{
    public static void main(String[] args) 
    {
        // typesafety
        // String ar[]=new String[10];
        // ar[0]="Hyder";
        // ar[1]="Pw";
        // //ar[2]=10; CompileTimeError
        
        // String name1=ar[0];
        // String name2=ar[1];

        //No TypeSafety
        // ArrayList a1=new ArrayList();

        //TypeSAfety Achieved Using Generics
        ArrayList<String> a1=new ArrayList<String>();

        a1.add("Hyder");
        a1.add("Pw");
        
        // a1.add(10);

        // String n1=(String)a1.get(0);  //typecasting
        // String n2=(String)a1.get(1);  
        // String n3=(String)a1.get(2);  
    
        String name1=a1.get(0);
        String name2=a1.get(1);
    }
}
