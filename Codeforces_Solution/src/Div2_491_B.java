import java.io.*;
import java.util.*;

public class Div2_491_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();

        int a[] = new int[n];
        int sum = 0;
        for(int i = 0;i<n;i++){
            a[i] = in.nextInt();
            sum+=a[i];
        }
        double avg = (sum*100)/(100.0*n);
        avg = Math.round(avg);
        int avggg = (int)avg;
       // debug(Math.round(avg));
        if(avggg==5){
            pw.println(0);
        }
        else {
            Arrays.sort(a);
            int c = 0;
            for(int i = 0;i<n;i++){
                c++;
                sum-=a[i];
                sum+=5;

                double average = (sum*100)/(100.0*n);
                average = Math.round(average);

                if(average==5){
                    break;
                }
            }

            pw.println(c);
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
