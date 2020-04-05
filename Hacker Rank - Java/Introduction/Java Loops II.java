import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int j=1; j<=n; j++) {
                double sum = a;
                for(int k=1; k<=j; k++) {
                    sum = sum + (Math.pow(2,k-1)*b);
                }
                System.out.printf("%.0f ",sum);
            }
            System.out.println("");
        }
        in.close();
    }
}
