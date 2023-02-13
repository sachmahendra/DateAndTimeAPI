/*

import java.util.*;
import java.time.*;

public class A263JavaTimeClasses {
    public static void main(String[] args) {
        
        ZonedDateTime zdt = ZonedDateTime.now(); // all about current time
        System.out.println("1 :"+zdt);

        OffsetDateTime odt = OffsetDateTime.now();
        System.out.println("2 :"+odt);

        // LIKE OTHER CLASS IT ALSO HAS MANY MATHOD WHICH WE CAN CHECK AS

      //  ZonedDateTime adt = ZonedDateTime.now(); // all about current time
      //  System.out.println("3 :"+adt.);    WE CAN CHECK ALL THE METHOD HERE NEXT TO adt.
    }
}

 */

 //here some other 

 import java.util.*;
import java.time.*;

public class A263JavaTimeClasses {
    public static void main(String[] args) {
        
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/Los_Angeles")); // all about current time
        System.out.println("1 :"+zdt);

        MonthDay md = MonthDay.now();

        Period p =Period.of(2,2,10);
        System.out.println("2 :"+p);


        Instant i=Instant.now();
        System.out.println("4 :"+i);


       
    }
}
