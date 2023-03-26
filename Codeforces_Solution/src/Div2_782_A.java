import java.io.*;
import java.util.*;

public class Div2_782_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(),red  =in.nextInt(),blue = in.nextInt();

            int red_clr = red/(blue+1);
            int red_left = (red)%(blue+1);

            StringBuilder sb = new StringBuilder();

            for(int i = 0;i<blue;i++){
                for(int j = 0;j<red_clr;j++){
                    sb.append("R");

                }
                if(red_left>=1){
                    red_left--;
                    sb.append("R");
                }
                sb.append("B");
            }
            for(int i = 0;i<red_clr;i++){
               sb.append("R");
            }

            pw.println(sb.toString());

        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
