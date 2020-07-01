import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();

        StringBuilder string = new StringBuilder();
        for (int i=0; i<n; i++)
            string.append(" ");
        int j = 0;

        for (int i=1; i<=n; i++) {
            string.replace(string.length() - i, string.length() - j, "#");
            System.out.println(string);
            j++;
        }

    }
}
