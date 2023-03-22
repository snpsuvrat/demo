import java.util.Scanner;

public class ExceptionFinally 
{
    public static void main(String[] args) 
 {
    String name = null;
    int num = 0;
    
    Scanner numScanner= new Scanner(System.in);
    try 
    {
        num = numScanner.nextInt();
        
    } 
    catch (Exception e) 
    {
        System.out.println("ENTER A INT VALUE");
    }
    finally
    {
        numScanner.close();
    }
    
    System.out.println(num);
 }   
}
