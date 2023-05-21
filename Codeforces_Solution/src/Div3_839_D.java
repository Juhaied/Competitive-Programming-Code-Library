import java.io.*;
import java.util.*;

public class Div3_839_D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            ArrayList<Integer> list = new ArrayList<>();

            int a[] = new int[n];

            for(int i = 0;i<n;i++){
                a[i] = in.nextInt();
                list.add(a[i]);
            }

            Collections.reverse(list);

            int rev[] = new int[n];

            for(int i = 0;i<n;i++){
                rev[i] = list.get(i);
            }
            if(isSorted(a)){
                pw.println(0);
            }
            else if(isSorted(rev)){
                pw.println(Collections.max(list));
            }
            else{
                int left = 0,right = (int) 1e9;

                for(int i = 0;i<n-1;i++){
                    if(a[i]==a[i+1]){
                        continue;
                    }
                    else if(a[i]<a[i+1]){
                        int value = (a[i]+a[i+1])/2;
                        right = Math.min(right,value);
                    }
                    else {
                        int value = (a[i]+a[i+1]+1)/2;
                        left = Math.max(value,left);
                    }
                }

                if(right>=left){
                    pw.println(right);
                }
                else {
                    pw.println(-1);
                }
            }


        }
        pw.close();
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < arr[i - 1])
                return false;
        return true;
    }
    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
