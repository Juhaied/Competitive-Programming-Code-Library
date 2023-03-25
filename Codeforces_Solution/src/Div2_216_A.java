import java.io.*;
import java.util.*;

public class Div2_216_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt(),bowls = in.nextInt(),plates = in.nextInt();
        int type1 = 0,type2 = 0;

        for(int i  = 0;i<n;i++){
            int v = in.nextInt();

            if(v==1){
                type1++;
            }
            else {
                type2++;
            }
        }

        if(bowls>=type1){
            bowls=bowls-type1;

            bowls+=plates;

            if(bowls>=type2){
                pw.println(0);
            }
            else {
                pw.println(Math.abs(type2-bowls));
            }
        }
        else{
            int need = type1-bowls;

            if(plates>=type2){
                pw.println(need);
            }
            else{
                need+=(Math.abs(type2-plates));
                pw.println(need);
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
