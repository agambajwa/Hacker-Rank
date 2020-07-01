import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long minVal = 0, maxVal = 0;
        for (int i = 0; i < 5; i++) {
            long minf = sumOfNumbers(i, arr);
            long maxf = sumOfNumbers(i, arr);
            if (i == 0) {
                minVal = minf;
                maxVal = maxf;
            }
            if (minf < minVal) {
                minVal = minf;
            }
            if (maxf > maxVal) {
                maxVal = maxf;
            }
        }
        System.out.println(minVal + " " + maxVal);
    }

    static long sumOfNumbers(int a, int[] arr) {
        long sum = 0;
        for (int i = 0; i < 5; i++) {
            if (a != i) {
                sum += (long) arr[i];
            }
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
