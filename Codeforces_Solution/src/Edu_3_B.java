import java.io.*;
import java.util.*;

public class Edu_3_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt(), k = in.nextInt();

        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 0;i<n;i++){
            l.add(in.nextInt());
        }

        Collections.sort(l);

        Map<Integer,Integer> map = new HashMap<>();

        int a[] = new int[n];

        for(int i = 0;i<n;i++){
            a[i] = l.get(i);
        }
        for(int i = 0;i<n;i++){
            map.put(a[i],i);
        }
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum+=(n-map.get(a[i]));

        }

        pw.println(sum-n);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
