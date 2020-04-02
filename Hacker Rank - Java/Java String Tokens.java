import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        s = delLeadingNonLetters(s);

        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        String[] arrOfS = s.split("[^a-zA-Z]+");
        System.out.println(arrOfS.length);
        for (String ele: arrOfS) {
            if(ele == " ") {}
            else {
                System.out.println(ele);
            }
        }
        scan.close();
    }
    private static String delLeadingNonLetters(String s) {
        int i;
        for (i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                break;
            }
        }
        return s.substring(i);
    }
}

