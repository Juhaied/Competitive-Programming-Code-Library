import java.io.*;
import java.util.*;

public class Div3_582_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

       int n = in.nextInt();
       int oc = 0,ec = 0;

       for (int i =1;i<=n;i++){
           int v = in.nextInt();

           if(v%2==0){
               ec++;
           }
           else {
               oc++;
           }
       }

       pw.println(Math.min(oc,ec));
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
