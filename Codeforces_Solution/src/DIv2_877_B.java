import java.io.*;
import java.util.*;

public class DIv2_877_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            ArrayList<Integer> list = new ArrayList<>();
            int n = in.nextInt();
            for(int i = 1;i<=n;i++){
                list.add(in.nextInt());
            }

            int one = list.indexOf(1),two = list.indexOf(2),mac = list.indexOf(n);

            if(one<two && two<mac){
                pw.println(two+1+" "+(mac+1));

            }
            else if(two<one && one<mac){
                pw.println(one+1+" "+(mac+1));
            }
            else if(mac<one && one<two){
                pw.println(one+1+" "+(mac+1));
            }
            else if(mac<two && two<one){
                pw.println(mac+1+" "+(two+1));
            }
            else {
                pw.println(1+" "+1);
            }

        }
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