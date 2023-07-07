import java.io.*;
import java.util.*;

public class Edu_151_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), k = in.nextInt(),x = in.nextInt();

            if(x!=1){
                pw.println("YES");
                pw.println(n);
                for (int i = 1;i<=n;i++){
                    pw.print(1+" ");
                }

                pw.println();
            }
            else if(x==1 && k==1){
                pw.println("NO");
            }
            else{
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = 1;i<=k;i++){
                    if(i !=x){
                        list.add(i);
                    }
                }
                boolean flag = false;
                int val = 0;
                for (int i = 0;i<list.size();i++){
                    if(n % list.get(i)==0){
                        val = list.get(i);
                        flag = true;
                        break;
                    }
                }

                if(flag){
                    int div  = n/val;
                    pw.println("YES");
                    pw.println(div);
                    for (int i = 1;i<=div;i++){
                        pw.print(val+" ");
                    }
                    pw.println();
                }

                else {

                    if(k>=3) {
                        int ans = (n - 3);
                        int div1 = ans / 2;
                        pw.println("YES");
                        pw.println(div1 + 1);

                        for (int i = 1; i <= div1; i++) {
                            pw.print(2 + " ");
                        }
                        pw.print(3);
                        pw.println();
                    }
                    else {
                        pw.println("NO");
                    }
                }
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
