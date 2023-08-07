import java.io.*;
import java.util.*;

public class Edu_111_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), a = in.nextInt(), b = in.nextInt();

            int sum = 0;
            String s = in.next();
            if(b>=0){
                sum = (a*n)+(b*n);
            }
            else{
                int cnt = 1;
                for (int i = 0;i<n-1;i++){
                    if(s.charAt(i)!=s.charAt(i+1)){
                        cnt++;
                    }
                }

                sum = (a*n)+(b * (cnt/2+1));
            }

            pw.println(sum);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
