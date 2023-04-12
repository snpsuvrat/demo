package MapAndGenerics;

import java.util.ArrayList;

class Gen<T>
{
    T obj;

    public Gen(T obj)
    {
        this.obj=obj;
    }

    void disp()
    {
        System.out.println("This type of data is : " + obj.getClass().getName());
    }

    public T getobj()
    {
        return obj;
    }
    
}
public class Generics03 
{
  public static void main(String[] args) 
  {
    Gen<Integer> g=new Gen<Integer>(10);

    g.disp();
    System.out.println(g.getobj());
    System.out.println("************************************");
    Gen<String> g1=new Gen<String>("PW");
    g1.disp();
    System.out.println(g1.getobj());


    /* 
        ArrayList<Gen> list1=new ArrayList<Gen>();
        List<String> list2=new ArrayList<String>();
        Collection<Integer> list3=new ArrayList<Integer>();
        
        //List<Object> list4=new ArrayList<String>();  //CompileTimeError // generics have to be same no parent and child class are allowed
        List<Integer> list5=new ArrayList<Integer>();
        
        //List<int> list6=new ArrayList<int>();  // no primitive data types are allowed in generics
    */
    
  }   
}
