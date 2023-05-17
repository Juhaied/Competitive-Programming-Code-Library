import java.io.*;
import java.util.*;

public class Div2_860_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i = 1;i<=n;i++){
                int m = in.nextInt();
                
                for(int j = 1;j<=m;j++){
                    map.put(in.nextInt(),i);
                }

            }


            ArrayList<Integer> list = new ArrayList<>();
            HashMap<Integer,Integer> mm = new HashMap<>();
            for(int i:map.keySet()){
                mm.put(map.get(i),i);
            }


            boolean flag = true;
            for(int i = 1;i<=n;i++){
                if(!mm.containsKey(i)){
                    flag = false;
                    break;
                }
            }

            if(flag){
                for(int i = 1;i<=n;i++){
                    pw.print(mm.get(i)+" ");
                }
                pw.println();
            }
            else {
                pw.println("-1");
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
