package MapAndGenerics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.*;
import java.util.Set;

class Student
{
    private String name;
    private int age;
    private String city;

    public Student(String name,int age,String city)
    {
        this.name=name;
        this.age=age;
        this.city=city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String toString()
    {
        return name + " " + age + " " + city;
    }
}

public class Map03 
{
  public static void main(String[] args) 
  {
    Student st1=new Student("rohan", 19, "agra");
    Student st2=new Student("rohit", 18, "delhi");
    Student st3=new Student("vijay", 28, "noida");


    Map map=new HashMap();
    map.put(1, st1);
    map.put(2, st2);
    map.put(3, st3);

    System.out.println(map);
     
    Set es=map.entrySet();
    Iterator itr=es.iterator();
    while(itr.hasNext())
    {
        //System.out.println(itr.next());
        Map.Entry Studata=(Entry)itr.next();
        System.out.println(Studata.getKey() + " " + Studata.getValue());
    }
    
  }   
}
