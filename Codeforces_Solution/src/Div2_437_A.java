import java.io.*;
import java.util.*;

public class Div2_437_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        char ch[] =  in.next().toCharArray();

        int c1 = 0, c2 = 0;

        for (int i = 0;i<n-1;i++){
            if(ch[i]!=ch[i+1]){
                if(ch[i]=='S'){
                    c1++;
                }
                else {
                    c2++;
                }
            }
        }
        if(c1>c2) {
            pw.println("YES");
        }
        else {
            pw.println("NO");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
