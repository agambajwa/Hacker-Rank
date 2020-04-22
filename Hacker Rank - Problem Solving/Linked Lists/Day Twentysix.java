import java.io.*;
import java.util.*;
import java.time.LocalDate;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        //Return date
        int day   = scan.nextInt();
        int month = scan.nextInt();
        int year  = scan.nextInt();
        LocalDate returnDate = LocalDate.of(year, month, day);
        //Due date
        day   = scan.nextInt();
        month = scan.nextInt();
        year  = scan.nextInt();
        LocalDate dueDate = LocalDate.of(year, month, day);

        scan.close();
        
        //Fine calculation
        int fine;
        if (returnDate.isEqual(dueDate) || returnDate.isBefore(dueDate)) {
            fine = 0;
        } else if (returnDate.getMonth() == dueDate.getMonth() && returnDate.getYear() == dueDate.getYear()) {
            fine = 15 * (returnDate.getDayOfMonth() - dueDate.getDayOfMonth());
            fine = 500 * (returnDate.getMonthValue() - dueDate.getMonthValue());
        } else {
            fine = 10000;
        }
        System.out.println(fine);
    }
}