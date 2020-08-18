package day08_LogicalOperators;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class test {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2018, 1, 18);
        LocalTime time = LocalTime.of(14, 42);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy | hh:mm");

        System.out.println(dateTime);

        ArrayList<String> pi = new ArrayList<>(Arrays.asList("Boston", "Houston", "Austin", "Lincoln", "Tulsa"));
        int a = pi.size();

        for (String str : pi) {
            String rev = "";

            for (int i = str.length() - 1; i >= 0; i --) {
                rev += str.charAt(i);
            }
            pi.set(--a, rev);
        }

        System.out.println(pi);

    }
}


