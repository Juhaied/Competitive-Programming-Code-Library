import java.io.*;
import java.util.*;

public class Unique_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        // An array is given where every number is occur twice except one number find it
        // Example : a = [1,2,2,3,3]
        // here nswer will be 1

        int n = in.nextInt();

        int a[] = new int[n];

        for (int i = 0;i<n;i++){
            a[i] = in.nextInt();
        }

        pw.println(unique(a));
        pw.close();
    }
    static  int unique(int a[]){
        int num = 0;
        for (int i = 0;i<a.length;i++){
            num^= a[i];
        }

        return num;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
