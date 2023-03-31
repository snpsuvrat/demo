package MapAndGenerics;
import java.util.*;

public class Map02 
{
    public static void main(String[] args) 
    {
        Map map =new HashMap();
        map.put(1,"rohan");
        map.put(2,"rohit");
        map.put(3,"rahul");
        map.put(4,"ramesh");

        System.out.println(map);

        System.out.println(map.get(4)); 

        Set keyset=map.keySet();   //return keys this method is used to return only keys not values

        Iterator itr1=keyset.iterator();
        while(itr1.hasNext())
        {
            //System.out.println(itr1.next());
            Integer keys=(Integer)itr1.next();   //we are downcasting the key to integer as they are objects 
            System.out.println(keys);
        }

        Collection values=map.values();          //return values this method is used to return only values not keys
        Iterator itr2= values.iterator();
        while(itr2.hasNext())
        {
            System.out.println(itr2.next());
        } 
        
        Set es=map.entrySet();               //return the entry (combination of keys and values are called entry)
        Iterator itr3=es.iterator();
        while(itr3.hasNext())
        {
            System.out.println(itr3.next());
        }
    }
}
