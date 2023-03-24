

class MyException extends Exception
{
    public MyException() {}

    public MyException(String msg) 
    {
        super(msg);
    }
}

public class CustomExcepThrow 
{
    public static void main(String[] args) 
    {
        int num1 = 6;
        int num2 =  -1;
        try
        {
            if (num2 < 0) 
            {
                Exception e = new MyException(" Negative Number is Entered");
                throw e;
            } 
            else 
            {
                int result=num1/num2;
                System.out.println("Result is " + result);
            }
        }
        catch(Exception e)
        {
            System.out.println("Enter VAlid Number " + e);
        }
    }
}
