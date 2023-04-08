package MapAndGenerics;

import java.util.HashMap;
import java.util.WeakHashMap;

class Employee
{
    private String name;
    private int empId;

    public Employee(String name,int empId)
    {
        this.name=name;
        this.empId=empId;
    }

    public String toString()
    {
        return name + " " + empId + "";
    }
    @Override
    public void finalize()
    {
        System.out.println("Clean up by Garbage Collector before dealoocating memory from heap ");
    }
}
public class Map05 
{
    public static void main(String[] args) 
    {
           Employee e=new Employee("hyder",171);
           
            HashMap hm=new HashMap();   //HashMap will dominate Garbage Collector so it will be unable to collect 
         //  WeakHashMap hm=new WeakHashMap();   //it doesnt dominate the garbage collector so garbage collector is able to do its work
           hm.put(e,"hyder");
           System.out.println(hm);

           

           e=null; //eligible for Garbage Collector ;
           System.out.println(e);
           System.gc(); //Garbage Collector will be  invoked ; it will call finalised method
           System.out.println(hm);
           System.out.println("Last Line");
    }
}
