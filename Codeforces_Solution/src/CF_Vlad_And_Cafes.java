import java.io.*;
import java.util.*;

public class CF_Vlad_And_Cafes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        int  a[] = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = in.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        int ans = -1;
        for(int i = n-1;i>=0;i--){
            if(set.contains(a[i])){
                continue;
            }
            else {
                set.add(a[i]);
                ans = a[i];
            }
        }

        pw.println(ans);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
