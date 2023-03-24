public class ConcatVSplus
{
    public static void main(String[] args) 
    {
       String s1 = "PW"; 
       String s2 = "PW" + "Skills"; 
       String s3 = s1 + s2;
       String s4 = s3 + 99 + 100;
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);
       System.out.println(s4);
    }
}
