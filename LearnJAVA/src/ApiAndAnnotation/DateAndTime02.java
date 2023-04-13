//Using Joda Time

package ApiAndAnnotation;

import java.time.*;
public class DateAndTime02 
{
  public static void main(String[] args) 
  {
      LocalDate date=LocalDate.now();    //we dont have constructor in this package so we are calling now() method 
      System.out.println(date);

      int day=date.getDayOfMonth();
      int month=date.getMonthValue();
      int year=date.getYear();

      System.out.println(day + "/" + month + "/" + year);
  
      LocalTime time=LocalTime.now();
      System.out.println(time);
      
      int hour=time.getHour();
      int min=time.getMinute();
      int sec=time.getSecond();
      int NanoSec=time.getNano();
      
      System.out.println(hour + ":" + min + ":" + sec + ":" + NanoSec );
    }   
}
