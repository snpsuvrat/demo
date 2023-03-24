import java.util.Scanner;

class Calc2 implements Runnable{
    public void run()
    {
        System.out.println("Enter Num 1 ");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println("Enter num2 ");
        int num2=sc.nextInt();

        int res = num1 + num2;

        System.out.println("CAlculation is " + res);
        System.out.println("CAlculation Ended");

        System.out.println("**********************************************************************");
    }
}

class ImpMesg1 implements Runnable
{

    public void run()
    {
        try 
        {
            for(int i=0;i<3;i++)
            {
                System.out.println("HELLO WORLD");
                Thread.sleep(2000);
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Some Error");
        }
    }
    
}



public class MultiThread6 
{
    public static void main(String[] args) throws InterruptedException 
    {
        System.out.println("Main Thread Started");
        Calc2 c1=new Calc2();
        ImpMesg1 m1=new ImpMesg1();
        

        Thread t1=new Thread(c1);
        Thread t2=new Thread(m1);
        
        System.out.println( t1.isAlive());
        t1.start();
        System.out.println( t1.isAlive());
    
        t1.join();
        t2.start();
        

        System.out.println("Main THREAD Ended");
    }
}
