import java.io.*;
import java.util.*;

public class Div2_190_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int a= in.nextInt(), b = in.nextInt(), c = in.nextInt();

        long ans = 0;

        for(int i = 0;i<3;i++){
            if(Math.min(a,Math.min(b,c))>=i){
                ans = Math.max(ans,i+(a-i)/3+(b-i)/3 +(c-i)/3);
            }
        }

        pw.println(ans);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
