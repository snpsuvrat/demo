class Example implements Runnable
{
    public void run()
    {  
        for(int i=0;i<3;i++)
        {
            try 
            {
               
                   
                System.out.println("Message");
               Thread.sleep(2000); 
            } 
            
            catch (Exception e) 
            {
                System.out.println("Thread is Interrupted");
            }
        }
    }
}


public class MultiThread7 
{
     public static void main(String[] args) 
     {
        Example e1=new Example();
        Thread t1=new Thread(e1);
        t1.start();
         t1.interrupt();
     }
}

