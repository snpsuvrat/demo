class Calc
{
    public int add(int n1,int n2)
    {
        int result = n1+n2;
         return result;
    }
    public int add(int n1,int n2,int n3)
    {
        int result = n1+n2+n3;
         return result;
    }
    public double add(double n1,double n2,double n3)
    {
        double result = n1+n2+n3;
         return result;
    }
}
public class MethodP
{
    public static void main(String []args)
    {
        Calc obj = new Calc();
        int result = obj.add(4,2);
        int res = obj.add(1,2,3);
        double res2 = obj.add(1.5,1.6,1.7);
        System.out.println(result);
        System.out.println(res);
        System.out.println(res2);
    }
}