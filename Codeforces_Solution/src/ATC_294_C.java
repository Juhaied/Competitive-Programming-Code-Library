import java.io.*;
import java.util.*;

public class ATC_294_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt(), m = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer,Integer> m1 = new HashMap<>();
        Map<Integer,Integer> m2= new HashMap<>();

        for(int i = 0;i<n;i++){
            int v = in.nextInt();
            list.add(v);
            m1.put(v,1);
        }
        for(int i = 0;i<m;i++){
            int v = in.nextInt();
            list.add(v);
            m2.put(v,1);
        }

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        Collections.sort(list);
        for(int i = 0;i<list.size();i++){
            if(m1.containsKey(list.get(i))){
                l1.add(i+1);
            }
            else {
                l2.add(i+1);
            }
        }

        for(int i = 0;i<l1.size();i++){
            pw.print(l1.get(i)+" ");
        }
        pw.println();
        for(int i = 0;i<l2.size();i++){
            pw.print(l2.get(i)+" ");
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
