/* 

import java.util.*;
import java.time.*;

public class A262DateApi {
    public static void main(String[] args) {
        
        Date d= new Date();

        System.out.println("1 :"+d);

      //  LocalDate dt=LocalDate.now();
      //  System.out.println("2 :"+dt);

   //   LocalDate dt=LocalDate.now(ZoneId.of("Asia/Kolkata"));// to know date of a zone
     // System.out.println("3 :"+dt);

   //   LocalDate dt=LocalDate.of(2023,Month.FEBRUARY,13);

   //   System.out.println("4 :"+dt);

    //  LocalDate dt=LocalDate.parse("2023-02-13"); // it give current date and date should be in the given formet
    //  System.out.println("5 :"+dt);

    LocalDate dt=LocalDate.parse("2023-02-13");
    LocalDate d1 = dt.plusMonths(6);  // AS WE KNOW THAT IN NEW JAVA PACKAGE  DATE AND TIME ARE NOT MUTABLE BECZ OF THIS HERE WE CREATE A NEW CLASS AS d1
    System.out.println("6 :"+d1); // it is use to add months in current month
    }
}


*/


// class for LOCAL TIME AND LOCAL DATE TIME BOTH NOW WE DISCUSS

import java.util.*;
import java.time.*;

public class A262DateApi {
    public static void main(String[] args) {
        
        LocalTime t = LocalTime.now();
        System.out.println("1 :"+t);

        LocalTime t1 = t.minusHours(3);
        System.out.println("2 :"+t1);

        LocalDateTime dt = LocalDateTime.now(); //uses time and date both together
        System.out.println("3 :"+dt);

        //THERE IS MANY MORE API'S IN THIS WHICH WE CAN CHECK IN IT
 
    }
}
