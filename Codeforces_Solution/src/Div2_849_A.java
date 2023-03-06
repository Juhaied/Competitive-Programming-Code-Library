import java.io.*;
import java.util.*;

public class Div2_849_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int a[] = new int[in.nextInt()];
        for(int i = 0;i<a.length;i++){
            a[i] = in.nextInt();
        }
        pw.println(solve(a));
        pw.close();
    }

    static int solve(int a[]){
        HashSet<Integer> set = new HashSet<>();

        for(int i :a){
            if(i !=0){
                set.add(i);
            }
        }
        return set.size();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
