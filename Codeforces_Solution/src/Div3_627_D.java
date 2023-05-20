import java.io.*;
import java.util.*;

public class Div3_627_D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();

            long a[] = new long[n];
            long b[] = new long[n];

            for(int i = 0;i<n;i++){
                a[i] = in.nextLong();
            }
            for (int i = 0;i<n;i++){
                b[i] = in.nextLong();
            }

            ArrayList<Long> list =new ArrayList<>();

            for(int i = 0;i<n;i++){
                list.add(a[i]-b[i]);
            }

            Collections.sort(list);
            long dif[] = new long[n];

            for(int i = 0;i<n;i++){
                dif[i] = list.get(i);
            }
            long ans = 0;
            for(int i = 0;i<n;i++){
                int left = i+1,right  = n-1;
                int ind = -1;

                while (left<=right){
                    int mid = (left+right)/2;

                    if(dif[i]+dif[mid]>0){
                        right = mid-1;
                        ind = mid;
                    }
                    else {
                        left = mid+1;
                    }
                }

                if(ind>-1){
                    ans+=n-ind;
                }
            }

            pw.println(ans);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
