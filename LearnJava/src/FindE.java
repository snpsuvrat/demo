import javax.lang.model.util.ElementScanner14;

public class FindE 
{
    public static void main(String[] args) 
    {
        String str = "Umblla";
        boolean EisThere = false;
        for(int i=0;i<str.length();i++)
        {
           if (str.charAt(i)=='e')
           {
            EisThere= true;
           }
        }
         if(EisThere)
         {
            System.out.println("E is there");
         }
         else
         {
            System.out.println("e not found");
         }
}
}
