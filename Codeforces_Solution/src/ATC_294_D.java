import java.io.*;
import java.util.*;

public class ATC_294_D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt(),query = in.nextInt();

        boolean came[] = new boolean[n];
        int curr = 0;
        for(int i = 0;i<query;i++){
            int t = in.nextInt();

            if(t==2){
                came[in.nextInt()-1] =true;
            }
            else if(t==3){
                while (came[curr]){
                    curr++;
                }
                pw.println(curr+1);
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
