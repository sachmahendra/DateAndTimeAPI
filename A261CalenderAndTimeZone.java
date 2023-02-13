/* 

import java.util.*;
public class A261CalenderAndTime {
    public static void main(String[] args) {
        
        GregorianCalendar gc = new GregorianCalendar(); //WE USE GregorianCalendar FOR THE INDIAN CALENDER

        System.out.println("1 :"+gc.isLeapYear(2020)); //MANY FNCTION AVAILABLE IN THIS FUNCTION

       System.out.println("2 :"+gc.get(Calendar.DAY_OF_WEEK));

        System.out.println("3 :"+gc.get(Calendar.DAY_OF_YEAR));     

    }
}

*/

//CODE FOR TIME ZONE

import java.util.*;
public class A261CalenderAndTimeZone{
    public static void main(String[] args) {

        GregorianCalendar gc = new GregorianCalendar();

        gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        
        TimeZone tz = gc.getTimeZone();
        
        System.out.println(tz.getID()); //same many other function are available

        

    }
}