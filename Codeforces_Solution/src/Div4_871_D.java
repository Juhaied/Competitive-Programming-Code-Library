import java.io.*;
import java.util.*;

public class Div4_871_D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), m = in.nextInt();

            if(n<m){
                pw.println("NO");
                continue;
            }
            else if(n==m){
                pw.println("YES");
                continue;
            }
            else if(n % 3!=0){
                pw.println("NO");
                continue;
            }
           PriorityQueue<Integer> pq= new PriorityQueue<>();

            pq.add(n);

            boolean flag = false;

            while (!pq.isEmpty()){
                int num = pq.poll();

                int a = num/3;

                if(a==m || a*2==m){
                    flag = true;
                    break;
                }

                if(a%3==0){
                    pq.add(a);
                }
                if((a*2)%3==0){
                    pq.add(a*2);
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

    static boolean solve(int n , int m){
        if(n==m) return  true;
        else if (n %3!=0) {
            return false;
        }
        else return (solve(n/3,m)||solve(n*2/3,m));
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
