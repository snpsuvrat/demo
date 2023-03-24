import java.util.jar.Attributes.Name;

public class MultiThread1
{
    public static void main(String[] args) 
    {
       System.out.println("Main Thread");
       System.out.println("BEfore Changing");
        String Name=Thread.currentThread().getName();
        
        System.out.println("The Name of main thread is " + Name);
        System.out.println("The Priority Level of Main Thread is " + Thread.currentThread().getPriority());

        System.out.println("After Changing");
        Thread t=Thread.currentThread();
        t.setName("CustomName1");
        t.setPriority(1);

        String name1=Thread.currentThread().getName();
        
        System.out.println("The Name of main thread is " + name1);
        System.out.println("The Priority Level of Main Thread is " + Thread.currentThread().getPriority());

    }
}