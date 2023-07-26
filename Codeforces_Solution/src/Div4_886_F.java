import java.io.PrintWriter;
import java.util.*;

public class Div4_886_F {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int test = in.nextInt();

        for (int t = 1; t<=test; t++){
            int n = in.nextInt();
            int a[]  = new int[n];
            Map<Integer,Integer> m1 = new HashMap<>();
            for (int i = 0;i<n;i++){
                a[i] = in.nextInt();
                if(!m1.containsKey(a[i])){
                    m1.put(a[i],1);
                }
                else {
                    m1.put(a[i],m1.get(a[i])+1);
                }
            }

            int b[] = new int[m1.size()];
            int cnt  = 0;
            for (Integer i :m1.keySet()){
                b[cnt] = i;
                cnt++;
            }

            Map<Integer,Integer> map =new HashMap<>();

            for (int i = 0;i<b.length;i++){
                for (int j = b[i];j<=n;j+=b[i]){
                    //  debug(j);
                    if(map.containsKey(j)){
                        map.put(j,map.get(j)+m1.get(b[i]));
                    }
                    else {
                        map.put(j,m1.get(b[i]));
                    }
                }
            }
            int ans = 0;
            for (Integer i :map.values()){
                ans = Math.max(ans,i);
            }
            pw.println(ans);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
