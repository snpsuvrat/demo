import java.util.Scanner;

class Calc1 implements Runnable{
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

class message1 implements Runnable
{  public void run()
    {
          System.out.println("Displaying Message Class");
        try
        {

            for(int i=0;i<4;i++)
            {
                System.out.println("Focus on your workd");
                Thread.sleep(2000);                                                        // mention time in miliseconds
            }
        }
       catch (Exception e) 
       {
            System.out.println("error");
        }
            System.out.println("Message class end");
    }
}

public class MultiThread4
{
    public static void main(String[] args) 
    {
          Calc1 c1=new Calc1();

          message1 m1=new message1();

          Thread t1=new Thread(c1);
          Thread t2=new Thread(m1);

          t1.start();
          t2.start();

          
    }
}