import java.io.*;
import java.util.*;

public class Edu_125_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            String s = in.next();

            int cnt = 0;
            int len = 0;
            int i = 0;
            while (i<n-1){
                if(s.charAt(i)==')' && s.charAt(i+1)=='('){
                    int k = i+2;
                    while (k<n && s.charAt(k)!= ')'){
                        k++;
                    }
                    if(k<n){
                        i = k+1;
                        cnt++;
                        len = i;
                    }
                    else {
                        break;
                    }
                }
                else {
                    cnt++;
                    i+=2;
                    len = i;
                    //debug(len);
                }
            }
            pw.println(cnt+" "+(n-i));
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
