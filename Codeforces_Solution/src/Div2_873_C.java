import java.io.*;
import java.util.*;

public class Div2_873_C {
    static int mod = (int) (1e9+7);
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();

            ArrayList<Integer> l1 = new ArrayList<>();
            for(int i = 0;i<n;i++){
                l1.add(in.nextInt());
            }

            ArrayList<Integer> l2 = new ArrayList<>();
            for(int i = 0;i<n;i++){
                l2.add(in.nextInt());
            }
            Collections.sort(l1);
            Collections.sort(l2);

            int a[] = new int[n];
            int b[] = new int[n];

            for(int i = 0;i<n;i++){
                a[i] = l1.get(i);
            }

            for(int i = 0;i<n;i++){
                b[i] = l2.get(i);
            }


            long ans = -1;

            for(int i = 0;i<n;i++){
                if(a[i]<=b[i]){
                    ans = 0;
                    break;
                }
            }

            if(ans == 0){
                pw.println(0);
            }
            else {
                ans = 1;

                for(int i = 0;i<n;i++){
                    int low = i,high = n-1;
                    int indx=0;
                    while (low<=high){
                        int mid = low+(high-low)/2;

                        if(a[i]>b[mid]){
                            indx = mid;
                            low=mid+1;
                        }
                        else {
                            high=mid-1;
                        }
                    }

                    long take = indx-i+1;

                    ans*=take;
                    ans%=mod;




                }

                pw.println(ans);
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
