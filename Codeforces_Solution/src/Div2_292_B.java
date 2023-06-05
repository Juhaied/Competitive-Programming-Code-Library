import java.io.*;
import java.util.*;

public class Div2_292_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt(), m = in.nextInt();

        boolean[] boy = new boolean[n];
        boolean girl[] = new  boolean[m];

        int c1 = in.nextInt();
        for (int i = 0;i<c1;i++){
            boy[in.nextInt()] = true;
        }
        int c2 = in.nextInt();
        for (int i = 0;i<c2;i++){
            girl[in.nextInt()] = true;
        }

        for (int i = 0;i<=(n*m)*Math.max(n,m)+1;i++){
            if(boy[i%n]){
                girl[i%m] = true;
            }
            if(girl[i%m]){
                boy[i%n] = true;
            }
        }

        boolean flag = true;

        for(int i = 0;i<n;i++){
            if(!boy[i]){
                flag = false;
                break;
            }
        }

        if(flag){
            for(int i = 0;i<m;i++){
                if(!girl[i]){
                    flag = false;
                    break;
                }
            }

            if(flag){
                pw.println("Yes");
            }
            else {
                pw.println("No");
            }
        }
        else {
            pw.println("No");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
