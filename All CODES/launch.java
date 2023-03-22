public class launch
{  
    public static void main(String[] args) 
    {
        // String s1="PWskills";
        // String s2=new String ("PWskills");
        // System.out.println(s1==s2);
        // System.out.println(s1.equals(s2));
        String s1="PWskills";
        String s2="PWskills";
        String s3="PWSKILLS";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));    // equalsIgnoreCase check the value without being case sensitive
        
    }
    
}
