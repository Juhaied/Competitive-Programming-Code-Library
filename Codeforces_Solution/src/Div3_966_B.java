import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Div3_966_B{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        PrintWriter pw = new PrintWriter(System.out);

        int test = in.nextInt();

        for (int t = 1;t<=test;t++) {
            int n = in.nextInt();
            HashMap<Integer,Integer> map = new HashMap<>();

            for (int i = 0;i<1;i++){
                map.put(in.nextInt(),1);
            }
            boolean flag = true;
            for (int i = 1;i<n;i++){
                int val = in.nextInt();

                if(map.containsKey(val-1) || map.containsKey(val+1)){
                    map.put(val,1);
                }
                else {
                    flag = false;
                    map.put(val,1);
                }
            }

            if(flag){
                pw.println("YES");
            }
            else {
                pw.println("NO");
            }
        }

        pw.close();

    }

    static  void debug(Object ...obj){
        System.err.println(Arrays.deepToString(obj));
    }
}
