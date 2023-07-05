import java.io.*;
import java.util.*;

public class Div2_539_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0;i<n;i++){
            int v = in.nextInt();
            sum+=v;
            list.add(v);
        }

       // debug(sum);
        Collections.sort(list);

        int ans = sum;
        for (int i = 0;i<n;i++){
            for (int j = 1;j<=list.get(i);j++){
                if(list.get(i) % j ==0){

                    int cur = sum-list.get(0)- list.get(i);

                    cur+= (list.get(0)*j)+(list.get(i)/j);
                    ans = Math.min(ans,cur);
                }
            }
        }

        pw.println(ans);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
