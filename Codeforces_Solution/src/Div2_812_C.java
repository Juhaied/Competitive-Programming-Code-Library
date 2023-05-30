import java.io.*;
import java.util.*;

public class Div2_812_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        while(t-->0) {

            int n = in.nextInt();
            int a[] = new int[100000];
            int i = 0, x = 0;
            while (true) {
                if (i * i > (n + n - 1))
                    break;
                a[x++] = i * i;
                i++;
            }
            int flag = 0;
            int ans[] = new int[n], j = x - 1;
            int vis[] = new int[n];
            for (i = n - 1; i >= 0; i--) {
                if (j < 0) {
                    flag = 1;
                    break;
                }
                int ind = a[j] - i;
                //System.out.println(ind+" "+i+" "+a[j]);
                if (ind >= n) {
                    j--;
                    i++;
                } else if (ind < 0) {
                    flag = 1;
                    break;
                } else {
                    if (vis[ind] == 1) {
                        j--;
                        i++;
                        continue;
                    }
                    vis[ind] = 1;
                    ans[ind] = i;
                }
            }
            if (flag == 1)
                System.out.println(-1);
            else {
                for (int val : ans)
                    System.out.print(val + " ");
                System.out.println();
            }
           // pw.close();
        }
    }
    static int findUpper(int a[] ,int x) { // immdeiate bigger value will be print
        int left  = 0,right = a.length-1, pos = -1;;

        while(left<=right) {
            int mid  = left+ (right-left)/2;

            if(a[mid]>x) {
                pos  = mid;
                right  = mid -1;;
            }
            else {
                left = mid +1;;
            }

        }

        return pos;
    }

    static ArrayList<Integer> square(int n){
        ArrayList<Integer> list = new ArrayList<>();
        int div=(n/2)+1;
        for(int i = 0;i<=div;i++){
            list.add(i*i);
        }

        return list;
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
