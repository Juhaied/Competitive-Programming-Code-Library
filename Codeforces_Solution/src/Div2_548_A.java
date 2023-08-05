import java.io.*;
import java.util.*;

public class Div2_548_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);


        int n = in.nextInt();

        String s = in.next();

        int pref[] = new int[n];
        int sum = 0;

        for (int i = 0;i<n;i++){
            int v = Integer.valueOf(s.charAt(i));

            if(v % 2==0){
                sum++;
            }

            pref[i] = sum;
        }
        int ans = 0;
        for (int i = 0;i<n;i++){
            ans+=pref[n-1]-pref[i];
        }

        pw.println(ans+pref[n-1]);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
