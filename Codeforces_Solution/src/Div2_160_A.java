import java.io.*;
import java.util.*;

public class Div2_160_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt(), k = in.nextInt();
        int cnt = 0;
        for (int i = 1;i<=n;i++){
            int val = in.nextInt(), luck = 0;

            while (val!=0){
                int rem = val%10;
                if(rem==4||rem==7){
                    luck++;
                }
                val/=10;
            }

            if(k>=luck){
                cnt++;
            }
        }

        pw.println(cnt);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
