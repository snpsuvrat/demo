import java.util.Scanner;

public class StringInput 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=scan.next();

        System.out.println("Entered String Is " + str);
    }
    
}
