class car implements Runnable
{
    public void run()
    {
        try 
        {
           System.out.println(Thread.currentThread().getName() + " HAs entered the Parking lot");
           Thread.sleep(2000);  
           synchronized(this)
            {   
               System.out.println(Thread.currentThread().getName() + " HAs started the car");
               Thread.sleep(2000);   
               System.out.println(Thread.currentThread().getName() + " moved out of the parking lot");
               Thread.sleep(2000);   
               System.out.println(Thread.currentThread().getName() + " HAs parked the car back in the parking lot");
               Thread.sleep(2000);   
            } 
        } 
        catch (Exception e) 
        {
            System.out.println("Error");
        }
    }
}



public class MultiThread8 
{
    public static void main(String[] args) 
    {
        car c=new car();

        Thread t1=new Thread(c);
        Thread t2=new Thread(c);
        Thread t3=new Thread(c);
        
        t1.setName("Son 1");
        t2.setName("Son 2");
        t3.setName("Son 3");

        t1.start();
        t2.start();
        t3.start();

    
    }
}
