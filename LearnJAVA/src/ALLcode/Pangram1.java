public class Pangram1 
{
   public static void main(String[] args) 
   {
      boolean Pang=false;
      String str="THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";
      str=str.toUpperCase();
      str=str.replace(" ", "");
      char []ch=str.toCharArray();
      int []ar=new int[26];

      for(int i=0;i<ch.length;i++)
      {
        ar[ch[i]-65]++;
        
      }
      for(int i=0;i<ar.length;i++)
      {
        if(ar[i]==0)
        {
            System.out.println("it is not an pangram");
            Pang=true;
        }
      }
      
        if(Pang==false)
        {
            System.out.println("it is a pangram");
        }
      
   }  
    
}
