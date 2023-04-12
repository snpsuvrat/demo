package MapAndGenerics;

import java.util.ArrayList;

class Student1
{
    private String name;
    private int id;
}

class Employee
{
    private String name;
    private int id;
}


public class Generics02 
{
  public static void main(String[] args) 
  {
      Student1 st1=new Student1();
      Student1 st2=new Student1();

      Employee e=new Employee();

    //   ArrayList ar=new ArrayList();
    //   ar.add(st1);
    //   ar.add(st2);
    //   ar.add(e);         //here it can add data from Employee class tooo so we have to achieve typesafety


    //to Achieve TypeSafety We Have to use Generics
      ArrayList<Student1> ar=new ArrayList<Student1>();
      ar.add(st1);
      ar.add(st2);
      // ar.add(e);   //now it shows error when we are adding data from outside the Student1 type
  }   
}
