/* 

import java.util.*;

public class A260DepreceatedDate {
    public static void main(String[] args) {
        
        System.out.println("1 :"+System.currentTimeMillis()); //IT WILL GIVE US THE TIME FROM 1 JAN 1970 TO CURRENT TIME IN MILLISECOND
         
        System.out.println("5 :"+Long.MAX_VALUE); // it gives maximum possible number of milisecond

        System.out.println("2 :"+System.currentTimeMillis()/1000); // it give time from 1 jan 1970 to current time in second

        System.out.println("3 :"+System.currentTimeMillis()/1000/60);//it will give in minute

        System.out.println("4 :"+System.currentTimeMillis()/1000/60/60/24/365);// it will give number of year from 1 jan 1970 to curremt year
  

        
    }
}

*/

// NOW WE USE DATE FUNCTION TO FIND OUT CURRENT DATE ADN DAY AND TIME
import java.util.*;

public class A260DepreceatedDate {
    public static void main(String[] args) {
        
      //  Date d = new Date();
     //   System.out.println(d);

        //WE CAN FIND OUT DAY OF ANY DATE WITH THE HELP OF THIS AS

     //   Date d = new Date("1/1/1980");// we can find out day of the date which is given in string
     //   System.out.println(d);

        // we have many function in this as

        Date d = new Date();
        System.out.println(d.getMonth()); // same as many and many



        
    }
}
