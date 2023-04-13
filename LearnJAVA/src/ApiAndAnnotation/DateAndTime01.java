package ApiAndAnnotation;

import java.sql.Date;

// import java.util.Date;  

public class DateAndTime01
{
    public static void main(String[] args) 
    {
       java.util.Date dt=new java.util.Date();    //if we are writing in  this format then we dont have to mention the package above;
       System.out.println(dt);

       long TimeInMs=dt.getTime();

       java.sql.Date dt1= new Date(TimeInMs);  //sql date class is dependent on util date class 

       System.out.println(dt1);


       //java.util.ArrayList a1=new java.util.ArrayList();
    }
}