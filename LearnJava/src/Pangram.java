// THIS WHOLE PROGRAM WILL CHECK ONLY IF THE STRING IS IN UPEER CASE SO YOU HAVE TO CONVER THE STRING IN UPPER CASE FIRST

public class Pangram 
{
    public static void main(String[] args) 
    {  
        boolean Pang=false;
       String str1=" THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";
    //    String str1=" the quick brown fox jumps over a lazy dog";
       str1=str1.replace(" ","");
    //    str1=str1.toLowerCase();
        str1=str1.toUpperCase();

       char []ch=str1.toCharArray();

       int []ar=new int [26];
       
       for(int i=0;i<ch.length;i++)
       {
          ar[ch[i]-65]++;
       }
       for(int i=0;i<ar.length;i++)
       {
        if(ar[i]==0)
        {
            System.out.println("Its not A Pangram");
            Pang=true;
        }
       }
       if(Pang==false)
       {
       System.out.println("It is a Pangram");
       }
    }
}
