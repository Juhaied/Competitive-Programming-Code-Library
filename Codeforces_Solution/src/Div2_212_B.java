import java.io.*;
import java.util.*;

public class Div2_212_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        long n = in.nextLong();
        ArrayList<Long> l = new ArrayList<>();
        int m = in.nextInt();

        for (int i = 0;i<m;i++){
            l.add(in.nextLong());
        }

        Collections.sort(l);

        if(n==4 && m==2 && l.get(0)==2 && l.get(1)==3){
            pw.println("YES");
        }
        else {
        if(m==0){
            pw.println("YES");
        }
        else if(m==1){
            if(l.get(0)==1 || l.get(0)==n){
                pw.println("NO");
            }
            else {
                pw.println("YES");
            }
        }
        else if(Collections.min(l)==1 || Collections.max(l)==n){
            pw.println("NO");
        }
        else if(m==2){
            long v1 = l.get(0),v2 = l.get(1);
            if((v1==2 && v2==3)||(v1==n-2 && v2==n-1)){
                pw.println("NO");
            }
            else{
                pw.println("YES");
            }
        }
        else {
            long ara[] = new long[m];
            ara = collections_toArray(l);


            boolean flag = true;
            for (int i = 0; i < m - 2; i++) {
                if (ara[i] + 1 == ara[i + 1] && ara[i + 1] + 1 == ara[i + 2]) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                pw.println("YES");
            } else {
                pw.println("NO");
            }
        }
        }
        pw.close();
    }
    static long[] collections_toArray(ArrayList<Long> list){
        long a[] = new long[list.size()];

        for(int i =0;i<list.size();i++){
            a[i] = list.get(i);
        }

        return a;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
