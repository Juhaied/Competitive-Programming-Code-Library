import java.io.*;
import java.util.*;

public class Edu147_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            char arr[]  = in.next().toCharArray();

            int ans = 0;
            int min = Integer.MAX_VALUE;

            for(char ch='a' ;ch<='z';ch++){
                int cnt  = 0;

                for(char c:arr){
                    if(c==ch){
                        cnt  = 0;
                    }
                    else {
                        cnt++;
                    }
                    ans =  Math.max(ans,cnt);
                }

                int value = 0;

                while (ans !=0){
                    ans/=2;
                    value++;
                }
                min = Math.min(min,value);
            }

            pw.println(min);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
