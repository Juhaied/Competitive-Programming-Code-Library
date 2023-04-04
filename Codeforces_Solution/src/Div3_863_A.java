import java.io.*;
import java.util.*;

public class Div3_863_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int test  = in.nextInt();


        for(int t = 1;t<=test;t++){

            int n = in.nextInt();
            char c = in.next().charAt(0);
            String s = in.next();
            char ch[] =s.toCharArray();
            int cnt = 0;
            for(int i = 0;i<n;i++){
                if(ch[i]<c){
                    break;
                }
                else {
                    cnt++;
                }
            }

            pw.println(s.substring(0,cnt)+""+c+""+s.substring(cnt));


            debug(cnt);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}