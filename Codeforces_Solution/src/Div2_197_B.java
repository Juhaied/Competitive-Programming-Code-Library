import java.io.*;
import java.util.*;

public class Div2_197_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt(), m = in.nextInt();
        Stack<Integer> stk = new Stack<>();

        stk.add(in.nextInt());
        for(int i = 1;i<m;i++){
            int v = in.nextInt();
            if(!stk.isEmpty()){
                if(v!=stk.peek()){
                    stk.push(v);
                }
            }
        }

        int a[] = new int[stk.size()];

        for(int i = a.length-1;i>=0;i--){
            a[i] = stk.pop();
        }


        int situated = 1;
        long cnt = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i]>=situated){
                cnt += (a[i]-situated);
                situated = a[i];
            }
            else {
                cnt+=(n-situated)+(a[i]);
                situated=a[i];
            }
        }

        pw.println(cnt);

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
