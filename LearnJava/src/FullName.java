public class FullName 
{
    public static void main(String []args)
 {
        int n=13;
        for(int i=0;i<n;i++)
  {  
            for(int j=0;j<n;j++)
            {
      if(i==0 && j>0 && j<(n-1) || j==0 && i>0 && i<=(n-1)/2 || i==(n-1)/2 || j==(n-1) && i>=(n-1)/2 || i==(n-1))
      {
        System.out.print("*");
      }
      else 
      {
        System.out.print(" ");
      }
    }
    //for u
      System.out.print("  ");
      for(int j=0;j<n;j++)
      {
        if(j==0 && i<(n-1) || i==(n-1) && j>0 && j<(n-1) || j==(n-1) && i<(n-1))
        {
            System.out.print("*");
        }
        else 
        {
            System.out.print(" ");
        }
      }
    //for v
       System.out.print("  ");
       for(int j=0;j<n;j++)
     {
        if(j==0 && i<=(n-1)/2 || j==(n-1) && i<=(n-1)/2 || i-j==(n-1)/2 || i+j==(n-1)+(n-1)/2)
        {
          System.out.print("*");
        }
        else 
        {
          System.out.print(" ");
        }
     }  //for R
       System.out.print("  ");
       for(int j=0;j<n;j++)
     {
       if(i==0 && j<(n-1) || j==0 ||  j==(n-1) && i>0 && i<(n-1)/2  || i == (n-1)/2 && j<(n-1) || i-j==(n-1)/2 )
       {
        System.out.print("*");
       }
       else 
       {
        System.out.print(" ");
       }
     }
       //For A
       System.out.print("  ");
       for(int j=0;j<n;j++)
     {
       if(i==0 && j>0 && j<(n-1) || j==0 && i>0 || j==(n-1) && i>0 || i==(n-1)/2)
       {
        System.out.print("*");
       }
       else 
       {
        System.out.print(" ");
       }
     }
       //FOR T
       System.out.print("  ");
       for(int j=0;j<n;j++)
     {
       if(i==0 || j==(n-1)/2)
       {
        System.out.print("*");
       }
       else 
       {
        System.out.print(" ");
       }
     }
     //for n
     System.out.print("     ");
     for(int j=0;j<n;j++)
    {
     if(j==0 || j==(n-1) || i==j)
     {
      System.out.print("*");
     }
     else 
     {
      System.out.print(" ");
     }
    }
     //for a
     System.out.print("  ");
     for(int j=0;j<n;j++)
    {
      if(i==0 && j>0 && j<(n-1) || j==0 && i>0 || j==(n-1) && i>0 || i==(n-1)/2)
      {
        System.out.print("*");
      }
      else 
      {
        System.out.print(" ");
      }
    }
     //for R
     System.out.print("  ");
     for(int j=0;j<n;j++)
    {
      if(i==0 && j<(n-1) || j==0 ||  j==(n-1) && i>0 && i<(n-1)/2  || i == (n-1)/2 && j<(n-1) || i-j==(n-1)/2 )
      {
        System.out.print("*");
      }
      else 
      {
        System.out.print(" ");
      }
    }
      //For A
      System.out.print("  ");
      for(int j=0;j<n;j++)
    {
      if(i==0 && j>0 && j<(n-1) || j==0 && i>0 || j==(n-1) && i>0 || i==(n-1)/2)
      {
       System.out.print("*");
      }
      else 
      {
       System.out.print(" ");
      }
    }
    //For y
    System.out.print("  ");
    for(int j=0;j<n;j++)
  {
    if(i==j && i<=(n-1)/2 || i+j==(n-1) && i<=(n-1)/2 || j==(n-1)/2 && i>=(n-1)/2)
    {
     System.out.print("*");
    }
    else 
    {
     System.out.print(" ");
    }
  }
  //For A
  System.out.print("  ");
  for(int j=0;j<n;j++)
{
  if(i==0 && j>0 && j<(n-1) || j==0 && i>0 || j==(n-1) && i>0 || i==(n-1)/2)
  {
   System.out.print("*");
  }
  else 
  {
   System.out.print(" ");
  }
}
 //for n
 System.out.print("  ");
 for(int j=0;j<n;j++)
{
 if(j==0 || j==(n-1) || i==j)
 {
  System.out.print("*");
 }
 else 
 {
  System.out.print(" ");
 }
}
//for p
System.out.print("     ");
for(int j=0;j<n;j++)
{
if(i==0 && j<(n-1) || j==0 ||  j==(n-1) && i>0 && i<(n-1)/2  || i == (n-1)/2 && j<(n-1))
{
 System.out.print("*");
}
else 
{
 System.out.print(" ");
}
}
//for a
System.out.print("  ");
for(int j=0;j<n;j++)
{
if(i==0 && j>0 && j<(n-1) || j==0 && i>0 || j==(n-1) && i>0 || i==(n-1)/2)
{
 System.out.print("*");
}
else 
{
 System.out.print(" ");
}
}
//for n
System.out.print("  ");
for(int j=0;j<n;j++)
{
if(j==0 || j==(n-1) || i==j)
{
 System.out.print("*");
}
else 
{
 System.out.print(" ");
}
}
//for d
System.out.print("  ");
for(int j=0;j<n;j++)
{
if(i==0 && j<(n-1) || j==0 || i==(n-1) && j<(n-1) || j==(n-1) && i>0 && i<(n-1))
{
 System.out.print("*");
}
else 
{
 System.out.print(" ");
}
}
//for e
System.out.print("  ");
for(int j=0;j<n;j++)
{
if(i==0 && j>0 || i==(n-1) && j>0 || j==0 && i>0 && i<(n-1) || i==(n-1)/2 && j<(n-1))
{
 System.out.print("*");
}
else 
{
 System.out.print(" ");
}
}
//for Y
System.out.print("  ");
for(int j=0;j<n;j++)
{
if(i==j && i<=(n-1)/2 || i+j==(n-1) && i<=(n-1)/2 || j==(n-1)/2 && i>=(n-1)/2)
{
 System.out.print("*");
}
else 
{
 System.out.print(" ");
}
}

      System.out.println();
  
 }
}
}
