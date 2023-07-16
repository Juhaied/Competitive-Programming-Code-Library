import org.omg.PortableInterceptor.INACTIVE;

import java.io.*;
import java.util.*;

public class Edu_37_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0;i<n;i++){
            a[i] = in.nextInt();
        }

        char ch[] = in.next().toCharArray();

        int max = 0;
        boolean flag = true;


        for (int i = 0;i<n-1;i++){
            max = Math.max(max,a[i]);

            if(ch[i]=='0' && max > (i+1)){
                flag = false;
                break;
            }
        }

        if(flag){
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
