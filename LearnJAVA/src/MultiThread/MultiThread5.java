import java.util.Scanner;

class MyThread extends Thread
{   
    public void run()
    {
        String tName=Thread.currentThread().getName();
        if (tName.equals("CALC")) 
        {
           Calc();   
        } 
        else 
        {
            ImpMesg();   
        }
    }
    public void Calc()
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

    public void ImpMesg()
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



public class MultiThread5 
{
  public static void main(String[] args) 
  {
      System.out.println("Main Thread Started");

      MyThread t1=new MyThread();
      MyThread t2=new MyThread();

      t1.setName("CALC");
      t2.setName("PRINT");

      t1.start();
      t2.start();
  }   
}
