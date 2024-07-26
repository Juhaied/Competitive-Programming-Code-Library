import java.io.*;
import java.util.*;

public class Div3_962_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            if(n<4){
                pw.println(1);
            }
            else {
                if(n %4==0){
                    pw.println(n/4);
                }
                else {
                    int div = n / 4;
                    pw.println(div + 1);
                }
            }
        }

        /*
         * */
        pw.close();
    }
    // 1 2 4 5 10
    static int binary_search(int a[],int target){
        int left = 0, right = a.length-1;
        int index = -1;

        while (left<=right){
            int mid = left + (right-left)/2;

            if(a[mid]>target){
                right = mid-1;
            }
            else if(a[mid]<target){
                left = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
