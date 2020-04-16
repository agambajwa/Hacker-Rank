import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        for(int j=0; j<n; j++) {
            String s = S.next();

            for(int i=0; i<s.length(); i+=2) {
                System.out.print(s.charAt(i));
            }

            System.out.print(" ");

            for(int i=1; i<s.length(); i+=2) {
                System.out.print(s.charAt(i));
            }

            System.out.println("");
        }        
        S.close();
    }
}
