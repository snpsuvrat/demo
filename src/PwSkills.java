import javax.lang.model.util.ElementScanner6;

public class PwSkills
{
    public static void main(String []args)
 {
      int n=7;
    for(int i=0;i<n;i++)
  {   
    // for p
        for(int j=0;j<n;j++)
        if(i==0 && j<(n-1) || j==0 ||  j==(n-1) && i>0 && i<(n-1)/2  || i == (n-1)/2 && j<(n-1))
        {
            System.out.print("*");
        }
        else
        {
            System.out.print(" ");
        }
        System.out.print("  ");
   // for w
        for(int j=0;j<n;j++)
        if(j==0 || i+j==(n-1) && i>=(n-1)/2 || i-j==0 && i>=(n-1)/2 || j==(n-1) )
        {
          System.out.print("* ");
        }
        else 
        {
          System.out.print("  ");
        }
      System.out.print("    ");

    //for S
      for(int j=0;j<n;j++)
      if(i==0 && j>0 && j<(n-1) || j==0 && i>0 && i<=(n-1)/2 || i==(n-1)/2 || j==(n-1) && i>=(n-1)/2 || i==(n-1))
      {
        System.out.print("*");
      }
      else 
      {
        System.out.print(" ");
      }
      System.out.print("  ");
    //for k
    for(int j=0; j<n; j++)
    {
        if(j==0 || i+j==(n-1)/2 || i-j==(n-1)/2)
        {
         System.out.print("*");
        }
        else 
        {
            System.out.print(" ");
        }
      }
        System.out.print("  ");
    
      // for I
      for(int j=0; j<n; j++)
    {
        if(i==0 || j==(n-1)/2 || i==(n-1))
        {
         System.out.print("*");
        }
        else 
        {
            System.out.print(" ");
        }
      }
        System.out.print("  ");
    
    //for L
    System.out.print("  ");
      for(int j=0; j<n; j++)
    {
        if(j==0 || i==(n-1))
        {
         System.out.print("*");
        }
        else 
        {
            System.out.print(" ");
        }
      }

      //for L
        System.out.print("  ");
        for(int j=0; j<n; j++)
        {
            if(j==0 || i==(n-1))
            {
             System.out.print("*");
            }
            else 
            {
                System.out.print(" ");
            }
          }
          System.out.print("  ");

          //for S
            for(int j=0;j<n;j++)
            if(i==0 && j>0 && j<(n-1) || j==0 && i>0 && i<=(n-1)/2 || i==(n-1)/2 || j==(n-1) && i>=(n-1)/2 || i==(n-1))
            {
              System.out.print("*");
            }
            else 
            {
              System.out.print(" ");
            }
      
    
        System.out.println();
  }

}
}

            
  
            