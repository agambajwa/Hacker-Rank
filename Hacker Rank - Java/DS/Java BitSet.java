import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        int m = S.nextInt();
        int n = S.nextInt();

        BitSet B1 = new BitSet(m);
        BitSet B2 = new BitSet(m);

        for(int i=0; i<n; i++) {
            String str = S.next();
            int a      = S.nextInt();
            int b      = S.nextInt();
            switch (str) {
                case "AND":
                    if (a == 1)
                        B1.and(B2);
                    else
                        B2.and(B1);
                    break;

                case "OR":
                    if (a == 1)
                        B1.or(B2);
                    else
                        B2.or(B1);
                    break;

                case "XOR":
                    if (a == 1)
                        B1.xor(B2);
                    else
                        B2.xor(B1);
                    break;

                case "FLIP":
                    if (a == 1)
                        B1.flip(b);
                    else
                        B2.flip(b);
                    break;

                case "SET":
                    if (a == 1)
                        B1.set(b);
                    else
                        B2.set(b);
                    break;

                default:
                    break;
            }
            System.out.println(B1.cardinality() + " " + B2.cardinality());
        }
        S.close();
    }
}