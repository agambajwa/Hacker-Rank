import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int countPlus = 0, countMinus = 0, countZero = 0, total = arr.length;
        for(int i=0; i<total; i++) {
            if(arr[i] > 0)
                countPlus++;
            else if(arr[i] < 0)
                countMinus++;
            else 
                countZero++;
        }
        System.out.printf("%.6f \n", (float) countPlus/total);
        System.out.printf("%.6f \n", (float) countMinus/total);
        System.out.printf("%.6f", (float) countZero/total);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
