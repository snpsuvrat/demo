package MapAndGenerics;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Map01 
{
    public static void main(String[] args) 
    {
        HashMap hm1=new HashMap();
        // hm1.put(null, "null");    
        hm1.put(02, "rohit");    
        hm1.put(03, "rohan");    
        hm1.put(04, "rohan");    
        // hm1.put(04, "rohan");  duplicates key are not considered    

        System.out.println(hm1);   
        
        HashMap hm2=new HashMap();
        hm2.put("virat", "rohit");    
        hm2.put("rohit","rohan");    
        hm2.put("rohan", "rohan");   
        System.out.println(hm2);        //to print in order of inserton you have to use LinkedHashMap

        LinkedHashMap lhm=new LinkedHashMap();
        lhm.put("virat", "rohit");    
        lhm.put("rohit","rohan");    
        lhm.put("rohan", "rohan");   
        System.out.println(lhm);   
    }
}
