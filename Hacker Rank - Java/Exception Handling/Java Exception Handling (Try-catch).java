import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        try {
            Scanner S = new Scanner(System.in);
            int x = S.nextInt();
            int y = S.nextInt();

            System.out.print(x/y);
        } catch(InputMismatchException e) {
            System.out.print(e.getClass().getName());
        } catch(ArithmeticException e) {
            System.out.println(e.getClass().getName() + ": / by zero");
        }
    }
}
