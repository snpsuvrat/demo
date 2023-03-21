import java.util.Scanner;

class Calc extends Thread{
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

class message extends Thread
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

public class MultiThread3
{
    public static void main(String[] args) 
    {
          Calc t1=new Calc();

          message t2=new message();

          t1.start();
          t2.start();

          
    }
}