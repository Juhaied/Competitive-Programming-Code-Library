import java.io.*;
import java.util.*;

public class Div3_713_D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            ArrayList<Long> list = new ArrayList<>();
            for(int i = 0;i<n+2;i++){
                list.add(in.nextLong());
            }
            n+=2;

            Collections.sort(list);

            long a[] = collections_toArray(list);

        //    debug(a);
            long pref[] = new long[n];

            pref[0] = a[0];

            for(int i = 1;i<n;i++){
                pref[i] = a[i]+pref[i-1];
            }

            if(pref[n-3]==a[n-2] || pref[n-3]==a[n-1]){
                for (int i = 0;i<n-2;i++){
                    pw.print(a[i]+" ");
                }
                pw.println();
            }

            else
            {
                boolean flag = false;
                for(int i=0;i<n-1;i++)
                {
                    long x = pref[n-1]-a[i] - a[n-1];
                    if(x == a[n-1])
                    {
                        flag = true;
                        for(int j=0;j<n-1;j++)

                        {
                            if(i==j)
                                continue;

                            pw.print(a[j]+" ");
                        }

                        break;
                    }
                    if(flag)
                    {
                        break;
                    }


                }
                if(!flag)
                {
                    pw.print(-1);
                }
                pw.println();
            }


        }
        pw.close();
    }
    static long[] collections_toArray(ArrayList<Long> list){
        long a[] = new long[list.size()];

        for(int i =0;i<list.size();i++){
            a[i] = list.get(i);
        }

        return a;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}