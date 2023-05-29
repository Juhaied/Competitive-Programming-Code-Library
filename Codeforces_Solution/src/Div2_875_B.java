import java.io.*;
import java.util.*;

public class Div2_875_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();

            int a[] = new int[n+1];
            int b[] = new int[n+1];
            a[n] = -1;
            b[n] = -1;

            for(int i = 0;i<n;i++){
                a[i] = in.nextInt();

            }
            for(int i = 0;i<n;i++){
                b[i] = in.nextInt();

            }

            int c1 = 1;
            Map<Integer,Integer> m1= new HashMap<>();
            for(int i  = 1;i<=n;i++){
                if(a[i]==a[i-1]){
                    if(!m1.containsKey(a[i-1])){
                        m1.put(a[i-1],1);
                    }
                    c1++;
                }
                else {
                    if(!m1.containsKey(a[i-1])){
                        m1.put(a[i-1],1);
                    }
                    else {
                        m1.put(a[i - 1], Math.max(c1, m1.get(a[i - 1])));
                        c1 = 1;
                    }
                }
            }

            int c2 = 1;
            Map<Integer,Integer> m2= new HashMap<>();
            for(int i  = 1;i<=n;i++){
                if(b[i]==b[i-1]){
                    if(!m2.containsKey(b[i-1])){
                        m2.put(b[i-1],1);
                    }
                    c2++;
                }
                else {
                    if(!m2.containsKey(b[i-1])){
                        m2.put(b[i-1],1);
                    }
                    else {
                        m2.put(b[i - 1], Math.max(c2, m2.get(b[i - 1])));
                        c2 = 1;
                    }
                }
            }
            int max  = -10;

            for(Integer i:m1.keySet()){
                if(m2.containsKey(i)){
                    int sum = m1.get(i)+m2.get(i);
                    max = Math.max(sum,max);
                }
                else {
                    max = Math.max(max,m1.get(i));
                }
            }
            for(Integer i:m2.keySet()){
                if(m1.containsKey(i)){
                    int sum = m1.get(i)+m2.get(i);
                    max = Math.max(sum,max);
                }
                else {
                    max = Math.max(max,m2.get(i));
                }
            }

            pw.println(max);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
