import java.io.*;
import java.util.*;

public class Dv2_166_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int num = (int) 1e7;

        ArrayList<Integer> list = sieve();

        int a[] = new int[list.size()];

        for(int i = 0;i<a.length;i++){
            a[i] = list.get(i);
        }

        int n  = in.nextInt(), m = in.nextInt();

        int ara[][] =  new int[n][m];

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                int val = in.nextInt();

                ara[i][j] = findUpper(a,val)-val;
            }
        }

        long min =Long.MAX_VALUE;

        for(int i = 0;i<n;i++){
            long sum = 0;
            for(int j = 0;j<m;j++){
                sum+=ara[i][j];
            }
            min = Math.min(min,sum);
        }

        for(int i = 0;i<m;i++){
            long sum = 0;
            for(int j = 0;j<n;j++){
                sum+=ara[j][i];
            }
            //debug(sum);
           min = Math.min(sum,min);
        }


        pw.println(min);

        pw.close();
    }

    static int findUpper(int a[] ,int x) { // immdeiate bigger value will be print
        int left  = 0,right = a.length-1, pos = -1;;

        while(left<=right) {
            int mid  = left+ (right-left)/2;

            if(a[mid]>=x) {
                pos  = mid;
                right  = mid -1;;
            }
            else {
                left = mid +1;;
            }

        }
        if(pos != -1) {
            return a[pos];
        }
        return pos;
    }
    public static int N=(int) 1e7;
    public static boolean isPrime[] = new boolean[N + 1];
    static ArrayList<Integer> sieve() { // O(N lgN)

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

        ArrayList<Integer> l = new ArrayList<>();

        for(int i = 2; i <= N; i++)
        {
            if(isPrime[i] == true){
                l.add(i);
            }

        }
        return l;
    }

    public static List<Long> SieveList(int n)
    {
        boolean prime[] = new boolean[(int)(n+1)];
        Arrays.fill(prime, true);

        List<Long> l = new ArrayList<>();
        for (long p=2; p*p<=n; p++)
        {
            if (prime[(int)(p)] == true)
            {
                for(long i=p*p; i<=n; i += p)
                {
                    prime[(int)(p)] = false;
                }
            }
        }

        for (long p=2; p<=n; p++)
        {
            if (prime[(int)(p)] == true)
            {
                l.add(p);
            }
        }

        return l;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
