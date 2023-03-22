

class MyThread extends Thread
{
    public void run()     // run method can only used to run a task it cannon be invoked by the user if it is invoked then it will work as single thread 
    {
        System.out.println("Child Thread");
    }
}



public class MultiThread2 
{
    public static void main(String[] args) 
    {
       System.out.println("Main Thread");  
       MyThread t=new MyThread();
       t.start(); 
    }

    
}
