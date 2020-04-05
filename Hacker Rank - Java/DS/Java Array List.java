import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();

        ArrayList[] list = new ArrayList[n];

        for(int i=0; i<n; i++) {
            int d = S.nextInt();
            list[i] = new ArrayList<Integer>();
            for(int j=0; j<d; j++) {
                list[i].add(S.nextInt());
            }
        }

        int q = S.nextInt();
        for(int i=0; i<q; i++) {
            int x = S.nextInt();
            int y = S.nextInt();
            try {
                System.out.println(list[x-1].get(y-1));
            } catch(Exception E) {System.out.println("ERROR!");}
        }
    }
}
