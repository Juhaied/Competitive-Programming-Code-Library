import java.io.*;
import java.util.*;

public class Div3_587_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt();
        char ch[] = in.next().toCharArray();
        int cnt  = 0;

        for (int i = 0;i<n;i+=2){
            if(ch[i]==ch[i+1]){
                if(ch[i]=='a'){
                    ch[i]='b';
                    cnt++;
                }
                else if(ch[i]=='b'){
                    ch[i]='a';
                    cnt++;
                }
            }
        }
        String str = new String(ch);
        pw.println(cnt);
        pw.println(str);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
