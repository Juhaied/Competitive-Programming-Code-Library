import java.io.*;
import java.util.*;

public class Div2_727_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        long k = in.nextLong();
        long x = in.nextLong();
        Long a[] = new Long[n];

        for (int i = 0;i<n;i++){
            a[i] = in.nextLong();
        }

        Arrays.sort(a);

        Long c[] = new Long[n-1];

        for (int i = 0;i<n-1;i++){
            c[i] = a[i+1]-a[i];
        }
        Arrays.sort(c);

        long cnt = 0;

        for (int i = 0;i<c.length;i++){
            if(c[i]>x){
                if(k>=(c[i]-1)/x){
                    k-=(c[i]-1)/x;
                }
                else {
                    cnt++;
                }
            }
        }
        cnt++;
        pw.println(cnt);

        pw.close();
    }
    static int[] collections_toArray(ArrayList<Integer> list){
        int a[] = new int[list.size()];

        for(int i =0;i<list.size();i++){
            a[i] = list.get(i);
        }

        return a;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
