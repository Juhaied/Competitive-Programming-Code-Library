import java.io.*;
import java.util.*;

public class Prime_Class {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        Prime p = new Prime(90000000);
        p.sieve();

        p.primeFactorization(90000000);

        debug(p.pf);

        pw.close();
    }
    static class Prime{
        int N;
        ArrayList<Integer> prime;
        ArrayList<Long> pf;
        boolean[] isPrime;
        Prime(int N) {
            this.N = N + 5;
            prime = new ArrayList<>();
            isPrime = new boolean[this.N];
        }

        void sieve() {
            Arrays.fill(isPrime, true);
            isPrime[0] = false;
            isPrime[1] = false;
            for (int i = 2; i * i < N; i++) {
                if (!isPrime[i]) continue;
                for (int j = i * i; j < N; j += i) isPrime[j] = false;
            }
            for (int i = 2; i < N; i++) {
                if (isPrime[i]) prime.add(i);
            }
        }
        void primeFactorization(long n) {
            pf = new ArrayList<>();
            for(int i = 0; i < prime.size(); i++) {
                long p = prime.get(i);
                if (p * p > n) break;
                if (n % p == 0) {
                    while (n % p == 0) {
                        n /= p;
                        pf.add(p);
                    }
                }
            }
            if (n > 1) pf.add(n);
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
