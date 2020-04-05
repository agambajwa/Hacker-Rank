import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();

        for(int i=0; i<n; i++) {
            list.add(S.nextInt());
        }

        int q = S.nextInt();
        for(int i=0; i<q; i++) {
            String query = S.next();
            if(query.equals("Insert")) {
                int x = S.nextInt();
                int y = S.nextInt();
                list.add(x,y);
            }
            else {
                int x = S.nextInt();
                list.remove(x);
            }
        }
        for(Integer num : list) {
            System.out.print(num + " ");
        }
        
    }
}
