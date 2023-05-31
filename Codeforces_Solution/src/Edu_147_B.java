import java.io.*;
import java.util.*;

public class Edu_147_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();

            int a[] = new int[n];
            int b[] = new int[n];

            ArrayList<Integer> l = new ArrayList<>();

            for(int i = 0;i<n;i++){
                a[i] = in.nextInt();
                l.add(a[i]);
            }
            for(int i = 0;i<n;i++){
                b[i] = in.nextInt();
                //l.add(a[i]);
            }
            Collections.sort(l);
            int sorted[] = collections_toArray(l);

            boolean flag = true;

            for(int i = 0;i<n;i++){
                if(sorted[i]!=b[i]){
                    flag = false;
                    break;
                }
            }

            if(flag){
                pw.println(1+" "+n);
            }
            else {
                int left = 0,right  = 0;
                for(int i = 0;i<n;i++){
                    if(a[i]!=b[i]){
                        left = i;
                        break;
                    }
                }
                right = left;
                while (right+1<n && b[right]<=b[right+1]){
                    right++;
                }
                while (left-1>=0 && b[left-1]<=b[left]){
                    left--;
                }

                pw.println(left+1+" "+(right+1));
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
