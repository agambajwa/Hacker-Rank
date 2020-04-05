import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();

        int count[] = new int[26];
        int n = ch1.length;
        int m = ch2.length;

        if(n != m)
            return false;
        for(int i=0;i<n;i++) {
            count[ch1[i]-97]++;
            count[ch2[i]-97]--;
        }

        for(int i=0;i<26;i++) {
            if (count[i] != 0)
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}