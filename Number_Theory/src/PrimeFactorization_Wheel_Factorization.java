import java.io.*;
import java.util.*;

public class PrimeFactorization_Wheel_Factorization {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();

        ArrayList<Integer> divisors = new ArrayList<>();
        while (n % 2==0){
            n/=2;
            divisors.add(2);
        }


        for (int i = 3;i*i<=n;i+=2){
            if(n % i ==0){
                while (n%i==0) {
                    divisors.add(i);
                    n /= i;
                }
            }
        }

        if (n>1){
            divisors.add(n);
        }

        debug(divisors);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
