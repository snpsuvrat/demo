package CollectionFramework;

import java.util.Scanner;

class cal extends Thread
{
    public void run()
    {
        System.out.println("Enter a Number");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("Entered Number is " + n);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
        System.out.println("Sleep Executed1");
    }
}
public class CollectFrame1
{
    public static void main(String[] args) 
    {
       
           System.out.println("HEllo WORLD");

           cal c=new cal();
           c.start();
          
    }
}