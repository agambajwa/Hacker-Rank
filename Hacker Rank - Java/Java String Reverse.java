import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        byte [] byteArray = A.getBytes(); 
        byte [] result = new byte [byteArray.length]; 
        for (int i = 0; i<byteArray.length; i++) 
            result[i] = byteArray[byteArray.length-i-1];
        
        String B = new String(result);
        
        if(B.equals(A))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}