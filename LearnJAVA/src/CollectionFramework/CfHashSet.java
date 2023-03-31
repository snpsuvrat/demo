package CollectionFramework;
import java.util.*;

public class CfHashSet
{
    public static void main(String[] args) 
    {
        HashSet hs=new HashSet();
        hs.add(100);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        System.out.println(hs);

        LinkedHashSet hs1=new LinkedHashSet();     //it is used to preserve order of insertion
        hs1.add(100);
        hs1.add(20);
        hs1.add(30);
        hs1.add(40);
        System.out.println(hs1);
    }
}