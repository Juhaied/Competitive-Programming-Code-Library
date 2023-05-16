import java.io.*;
import java.util.*;

public class Div3_501_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        long n = in.nextLong(), k = in.nextLong();

        long s1 = 0,s2 = 0;

        long a[] = new long[(int) n];
        long b[] = new long[(int) n];
        ArrayList<Long> list = new ArrayList<>();
        for(int i = 0;i<n;i++){
            a[i] = in.nextLong();
            b[i] = in.nextLong();

            s1+=a[i];
            s2+=b[i];

            list.add(a[i]-b[i]);
        }

        Collections.sort(list);

        if(s1<=k){
           // debug("1");
            pw.println(0);
        }
        else if(s2>k){
            //debug(2);
            pw.println(-1);
        }
        else{
            int cnt = 0;
            while (true){
                if(s1<=k){
                    break;
                }
                cnt++;
                s1-= list.remove(list.size()-1);
            }

            pw.println(cnt);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
