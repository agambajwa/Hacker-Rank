import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {

    static int function(int[] arr, int d, int m) {
        int sum = 0;
        int ways = 0;

        if(m <= arr.length) {
            for(int i=0; i<m; i++) {
                sum += arr[i];
            }
        }
        if(sum == d)
            ways++;

        for(int i=0; i<arr.length-m; i++) {
            sum = sum - arr[i] + arr[i+m];
            if(sum == d)
                ways++;
        }

        return ways;
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        int n = S.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = S.nextInt();

        int d = S.nextInt();
        int m = S.nextInt();

        System.out.println(function(arr, d, m));
        S.close();
    }
}
