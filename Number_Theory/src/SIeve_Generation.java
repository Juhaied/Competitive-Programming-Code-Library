import java.io.*;
import java.util.*;

public class SIeve_Generation {
    static boolean isPrime[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = 100;
        isPrime = new boolean[N+1];

        for(int i = 0; i <= N; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = isPrime[1] = false;
        for(int i = 2; i*i <= N; i++) {
            if(isPrime[i] == true) {
                for(int j = i + i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        //debug(isPrime);

        for(int i = 2;i<=N;i++){
            if(isPrime[i]){
                pw.print(i+" ");
            }
        }
        pw.close();
    }



    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
