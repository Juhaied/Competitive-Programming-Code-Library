import java.io.*;
import java.util.*;

public class Div2_207_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        int a[] = new int[n];
        int sum = 0;

        for (int i = 0;i<n;i++){
            a[i] = in.nextInt();
            sum+=a[i];
        }

        int x  = in.nextInt(), y = in.nextInt(),s1 = 0,s2 = 0;

        for(int i = 0;i<n;i++){
            s1+=a[i];
            s2=sum-s1;

            if(s1>=x && s1<=y && s2>=x && s2<=y){
                System.out.println(i+2);
                return;
            }
        }
        System.out.println(0);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
