import java.util.*;
import java.time.LocalDateTime;
import java.time.format.*;
import java.time.temporal.ChronoField;

public class A264ChronoField {
    public static void main(String[] args) {
        
        LocalDateTime dt = LocalDateTime.now();

        System.out.println(dt.get(ChronoField.DAY_OF_MONTH));

        System.out.println(dt.get(ChronoField.YEAR));

        // WE CAN NOT USE CHRONO FIELD IN TIMEZONE 
    }
}
