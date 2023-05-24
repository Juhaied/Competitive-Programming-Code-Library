import java.io.*;
import java.util.*;

public class Edu_148_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int a[] = new int[n];

            HashSet<Integer> set = new HashSet<>();
            for(int i = 0;i<n;i++){
                a[i] = in.nextInt();
            }

            n = removeDuplicates(a,n);
            int ans  = n;

            //debug(ans);

            for(int i = 0;i+2<n;++i){
                if(a[i]>a[i+1] && a[i+1]>a[i+2]){
                    ans--;
                }
                if(a[i]<a[i+1] && a[i+1]<a[i+2]){
                    ans--;
                }
            }

            pw.println(ans);

        }
        pw.close();
    }
    public static int removeDuplicates(int[] nums, int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (i == n - 1 || nums[i] != nums[i + 1]) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
