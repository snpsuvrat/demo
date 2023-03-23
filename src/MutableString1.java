public class MutableString1 
{
    public static void main(String[] args) 
    {
        StringBuffer mn=new StringBuffer("Virat");
        System.out.println(mn);
        mn.append("kohli");
        System.out.println(mn);
        final StringBuffer nm=new StringBuffer("Sachin");
        System.out.println(nm);
    }
}
