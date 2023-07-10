import java.io.*;
import java.util.*;

public class Div3_739_D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();

            String str = String.valueOf(n);

            int ans = 100;

            if((n &(n-1))==0){
                pw.println(0);
            }
            else {
                for (int i = 0;i<60;i++){
                    String s = String.valueOf((long) Math.pow(2,i));

                    int j = 0;

                    for (int k = 0;k<str.length();k++){
                        if(j>=s.length()){
                            break;
                        }
                        if(s.charAt(j)==str.charAt(k)){
                            j++;
                        }
                    }

                    int rem =s.length()-j;
                    int rem2 = str.length()-j;
                    int a = rem+rem2;

                    if(a<ans){
                        ans=a;
                    }

                }

                pw.println(ans);
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
