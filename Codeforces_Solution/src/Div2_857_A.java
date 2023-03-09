import org.omg.PortableInterceptor.INACTIVE;

import java.io.*;
import java.util.*;

public class Div2_857_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<Integer> reversed = new ArrayList<>();
            ArrayList<Integer> poslist = new ArrayList<>();
            ArrayList<Integer> neglist =new ArrayList<>();
            for(int i = 0;i<n;i++){
                int v = in.nextInt();
                if(v<0){
                    neglist.add(v);
                }
                else {
                    poslist.add(v);
                }
                list.add(v);
                reversed.add(v);
            }

            Collections.sort(list);
            Collections.sort(reversed);
            Collections.reverse(reversed);

            // debug(list);
            //debug(reversed);

            int c = 0;
            int pos = 0,neg = 0;
            for(int i = 0;i<n;i++){
                if(reversed.get(i)>=0){
                    pos++;
                    pw.print(pos+" ");
                }
                else{
                    pos--;
                    pw.print(pos+" ");
                }
            }
            pw.println();

            int size = Math.min(poslist.size(), neglist.size());
            int copy = size*2;
            if(size==neglist.size()){
                while (size !=0){
                    pw.print(1+" "+0+" ");
                    size--;
                }
            }

            for(int i =1;i<=n-copy;i++){
                pw.print(i+" ");
            }
            pw.println();

        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
