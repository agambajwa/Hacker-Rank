import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        BigInteger one = S.nextBigInteger();
        BigInteger two = S.nextBigInteger();
        S.close();

        System.out.println(one.add(two));
        System.out.println(one.multiply(two));
    }
}
