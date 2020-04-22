import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
//Regex = ^[A-Za-z0-9+_.-]+@(.+)$


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String emailRegEx = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(emailRegEx);

        ArrayList<String> list = new ArrayList<String>();

        for(int i=0; i<N; i++) {
            String name = scanner.next();
            String email = scanner.next();

            Matcher match = pattern.matcher(email);

            if(match.find()) {
                list.add(name);
            }
        }

        Collections.sort(list);
        for(String element : list) {
            System.out.println(element);
        }

        scanner.close();
    }
}
