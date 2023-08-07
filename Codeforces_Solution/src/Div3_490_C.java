import java.io.*;
import java.util.*;

public class Div3_490_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        Map<Character,Integer> map = new HashMap<>();

        int n = in.nextInt(), k = in.nextInt();

        char ch[] = in.next().toCharArray();

        if(n==k){
            pw.println();
        }
        else {
            for (int i = 0;i<26;i++){
                for (int j = 0;j<n;j++){
                    if(k<=0)break;
                    if(ch[j]==(char)('a'+i)){
                        ch[j]='1';
                        k--;
                    }
                }
            }

            for (int i = 0;i<n;i++){
                if(ch[i]!='1'){
                    pw.print(ch[i]);
                }
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
