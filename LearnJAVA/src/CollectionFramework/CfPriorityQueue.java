package CollectionFramework;

import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class CfPriorityQueue 
{
    public static void main(String[] args) 
    {
        PriorityQueue pq1=new PriorityQueue<>();

        pq1.add(100);
        pq1.add(50);
        pq1.add(150);
        pq1.add(25);
        pq1.add(75);
        pq1.add(125);
        pq1.add(175);

        // pq1.add("PW");  no different form of data is allowed
        
        System.out.println(pq1);   
        pq1.add(25);
        System.out.println(pq1);            //print acc to complete binary treee form CBT not based on insertion
    }
}
