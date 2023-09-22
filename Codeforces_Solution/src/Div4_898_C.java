/*
 *   Juhaied Hossen
 *   North South University
 */

import java.io.*;
import java.util.*;



public class Div4_898_C{
    /* 10^(7) = 1s.
     * ceilVal = (a+b-1) / b */

    static final int mod = 1000000007;
    static final long temp = 998244353;
    static final long MOD = 1000000007;
    static final long M = (long)1e9+7;


    public static void main(String[] args) {

        FastReader in = new FastReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int test  = in.nextInt();

        for (int t = 0;t<test;t++) {

            char ch[][] = new char[10][10];

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    ch[i][j] = in.readChar();
                }
            }

            int c1 = 0;

            long val = 0;

            for (int i = 0;i<ch.length;i++){
                if(ch[0][i]=='X'){
                    c1++;
                }
                if(ch[9][i]=='X'){
                    c1++;
                }

            }

            for (int i = 1;i<=8;i++){
                if(ch[i][0]=='X'){
                    c1++;
                }
                if(ch[i][9]=='X'){
                    c1++;
                }

            }
            int c2 = 0;
            for (int i = 1;i<9;i++){
                if(ch[1][i]=='X'){
                    c2++;
                }
                if(ch[8][i]=='X'){
                    c2++;
                }
            }

            for (int i = 2;i<8;i++){
                if(ch[i][1]=='X'){
                    c2++;
                }
                if(ch[i][8]=='X'){
                    c2++;
                }

            }

            int c3 = 0;
            for (int i = 2;i<=7;i++){
                if(ch[2][i]=='X'){
                    c3++;
                }
                if(ch[7][i]=='X'){
                    c3++;
                }
            }

            for (int i = 3;i<=6;i++){
                if(ch[i][2]=='X'){
                    c3++;
                }
                if(ch[i][7]=='X'){
                    c3++;
                }

            }

            int c4 = 0;
            for (int i = 3;i<7;i++){
                if(ch[3][i]=='X'){
                  //  debug(3+" "+i);
                    c4++;
                }
                if(ch[6][i]=='X'){
                    c4++;
                }
            }

           if(ch[4][3]=='X'){
               c4++;
           }
           if(ch[5][3]=='X'){
                c4++;
           }
            if(ch[4][6]=='X'){
                c4++;
            }
            if(ch[5][6]=='X'){
                c4++;
            }

            int c5 = 0;

            if(ch[4][4]=='X'){
                c5++;
            }
            if(ch[4][5]=='X'){
                c5++;
            }
            if(ch[5][4]=='X'){
                c5++;
            }
            if(ch[5][5]=='X'){
                c5++;
            }

         //   debug(c1+" "+c2+" "+c3+" "+c4+" "+c5);

            c2*=2;
            c3*=3;
            c4*=4;
            c5*=5;


            pw.println(c1+c2+c3+c4+c5);

            //debug(c3);




        }
        pw.close();
    }
    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
    static class Pair implements Comparable<Pair> {
        int idx;
        long v;

        Pair(int idx, long v) {
            this.idx = idx;
            this.v = v;
        }

        @Override
        public int compareTo(Pair o) {
            if (this.v == o.v) {
                if (this.idx > o.idx) return 1;
                else return -1;
            }
            if (this.v < o.v) return 1;
            return -1;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "idx=" + idx +
                    ", v=" + v +
                    '}';
        }
    }
    public boolean isPerfectSquare(int num) {
        long low = 0 ;
        long high = num ;
        long mid = 0 ;
        long sq = 0 ;
        while(low <= high){
            mid = low + (high - low) / 2 ;

            sq = mid * mid ;

            if(num == 1) return true ;

            if(sq == num){
                return true ;
            }

            else if(sq < num){
                low = mid + 1 ;
            }

            else{
                high = mid - 1 ;
            }
        }
        return false ;
    }
    public  static char check(String val){
        if(val.equals("1")){
            return 'a';
        }
        else if(val.equals("2")){
            return 'b';
        }
        else if(val.equals("3")){
            return 'c';
        }
        else if(val.equals("4")){
            return 'd';
        }
        else if(val.equals("5")){
            return 'e';
        }
        else if(val.equals("6")){
            return 'f';
        }
        else if(val.equals("7")){
            return 'g';
        }
        else if(val.equals("8")){
            return 'h';
        }
        else if(val.equals("9")){
            return 'i';
        }
        else if(val.equals("10")){
            return 'j';
        }
        else if(val.equals("11")){
            return 'k';
        }
        else if(val.equals("12")){
            return 'l';
        }
        else if(val.equals("13")){
            return 'm';
        }
        else if(val.equals("14")){
            return 'n';
        }
        else if(val.equals("15")){
            return 'o';
        }
        else if(val.equals("16")){
            return 'p';
        }
        else if(val.equals("17")){
            return 'q';
        }
        else if(val.equals("18")){
            return 'r';
        }
        else if(val.equals("19")){
            return 's';
        }
        else if(val.equals("20")){
            return 't';
        }
        else if(val.equals("21")){
            return 'u';
        }
        else if(val.equals("22")){
            return 'v';
        }
        else if(val.equals("23")){
            return 'w';
        }
        else if(val.equals("24")){
            return 'x';
        }
        else if(val.equals("25")){
            return 'y';
        }
        else {
            return 'z';
        }
    }
    static long getMod_of_factorial(long n,long p) {
		/*
		 * int f = 1;

			for(int i =1;i<=5;i++){
			     f = (f*i) % 5;
			}
			I = 1 ; f = 1*1 % 5 = 1;
			I = 2; f = 1*2 % 5 = 2
			I = 3; f = 2*3 % 5 = 1;
			I = 4; f = 1*4%5=4;

		 */
        long fac = 1;

        for(int i = 1;i<=n;i++) {
            fac= (fac*i)%p;
            //System.out.println(fac);
        }

        return fac;
    }
    static long get_Mod_Of_Sum(long a, long b,long mod) {
        return ((a%mod)+(b%mod))%mod;
    }
    static long get_Mod_Of_Sub(long a, long b,long mod) {
        long ans =  ((a%mod)-(b%mod))%mod;

        if(ans<0) {
            return ans+mod;
        }
        else {
            return ans;
        }
    }

    static long get_Mod_Of_Mul(long a, long b,long mod) {
        return ((a%mod)*(b%mod))%mod;
    }
    static long get_Division_Mod(long a,long b ,long mod) {
        return (long) ((a*java.lang.Math.pow(b, mod-1)) % mod);
    }


    static long Power(long base,long power) {
        if(power==0)return 1;
        long temp = Power(base,power/2);
        long result = temp*temp;

        if(power %2==1) {
            result =result * base;
        }
        return result;

    }
    static long Power2(long a,long b) {
        long res = 1;
        while (b > 0) {
            if (b %2==1)
                res = res * a;
            a = a * a;
            b >>= 1;
        }
        return res;
    }

    static long get_Mod(long a , long b) {
        long x =  a % b;

        if(x<0) {
            x =  x +b;
        }

        return x;
    }

    static void fillPrefixSum(int arr[], int n, int prefixSum[])
    {
        prefixSum[0] = arr[0];
        // Adding present element with previous element
        for (int i = 1; i < n; ++i)
            prefixSum[i] = prefixSum[i - 1] + arr[i];
    }
    static int findIntSqrt(int value) {
        int l = 1,r = value,res= value;

        while(l<=r) {
            int mid = l + (r-l)/2;

            if(mid *mid <= value) {
                res = mid;
                l =mid +1;
            }
            else {
                r = mid -1;
            }
        }
        return res;
    }
    static double findsqrt(double value) {
        double l = 1,r=value,res=value;
        int trial = 70;
        while(l<=r && trial-->0) {
            double mid = l + (r-l)/2;

            if(mid * mid <= value) {
                res = mid;
                l=mid;
            }
            else {
                r= mid;
            }
        }

        return res;
    }
    static int findLower(int a[] ,int x) { // immdeiate smaller value will be print
        int left  = 0,right = a.length-1, pos = -1;;

        while(left<=right) {
            int mid  = left+ (right-left)/2;

            if(a[mid]<=x) {
                pos  = mid;
                left = mid+1;
            }
            else {
                right  = mid  -1;
            }

        }
        return pos;
    }

    static int findUpper(int a[] ,int x) { // immdeiate bigger value will be print
        int left  = 0,right = a.length-1, pos = -1;;

        while(left<=right) {
            int mid  = left+ (right-left)/2;

            if(a[mid]>x) {
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

    static int binary_Search(int a[] ,int x)
    {
        int left = 0,right = a.length-1;
        while(left <= right)
        {
            int mid = left + (right - left)/2;

            if(a[mid] >x){
                right = mid -1;
            }
            else if(a[mid] <x){
                left = mid + 1;
            }
            else {
                return mid;
            }

        }
        return-1;
    }
    public static int findFirst(int[] A, int x)
    {
        int left = 0,right = A.length - 1, pos = -1;

        while (left <= right)
        {
            int mid =left + (right - left)/2;


            if (x == A[mid]) {
                pos = mid;
                right = mid - 1;
            }

            else if (A[mid]>x) {
                right = mid - 1;
            }

            else {
                left = mid + 1;
            }
        }
        return pos;
    }
    static boolean isPowerOfTwo(int n)
    {
        if(n==0)
            return false;

        return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==
                (int)(Math.floor(((Math.log(n) / Math.log(2)))));
    }
    public static int gcd(int a, int b)
    {
        if(b == 0)
            return a;

        else
            return gcd(b,a%b);
    }

    private void shuffle(int[] arr) {
        Random rnd = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int idx = rnd.nextInt(i + 1);
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }
    }
    public static long lcm(long a, long b)
    {
        return (a / LongGCD(a, b)) * b;
    }

    public static long LongGCD(long a, long b)
    {
        if(b == 0)
            return a;

        else
            return LongGCD(b,a%b);
    }

    public static long LongLCM(long a, long b)
    {
        return (a / LongGCD(a, b)) * b;
    }

    static void upper_bound(int a[], int element,int size) {

        int low = 0,high = size-1;

        while(high-low>1) {
            int mid = (low+high)/2;

            if(a[mid]<=element) {
                low =  mid+1;
            }
            else {
                high = mid;
            }
        }

        if(a[low]>element) {
            System.out.println(a[low]);
            return ;
        }
        if(a[high]>element) {
            System.out.println(a[high]);
        }
        else {
            System.out.println(-1);
        }

    }

    static void lower_bound(int a[], int element,int size) {

        int low = 0,high = size-1;

        while(high-low>1) {
            int mid = (low+high)/2;

            if(a[mid]<element) {
                low =  mid+1;
            }
            else {
                high = mid;
            }
        }

        if(a[low]>=element) {
            System.out.println(a[low]);
        }
        if(a[high]>=element) {
            System.out.println(a[high]);
        }
        else {
            System.out.println(-1);
        }

    }
    public static int LowerBound(long a[], long x)
    {
        int l=-1,r=a.length;
        while(l+1<r)
        {
            int m=(l+r)>>>1;
            if(a[m]>=x) r=m;
            else l=m;
        }
        return r;
    }

    public static int UpperBound(long a[], long x)
    {
        int l=-1, r=a.length;
        while(l+1<r)
        {
            int m=(l+r)>>>1;
            if(a[m]<=x) l=m;
            else r=m;
        }
        return l+1;
    }
    static int binarySearchCount(int arr[],int n, int key){

        int left = 0;

        int right = n - 1;
        int count = 0;


        while (left <= right){

            int mid = (right + left) / 2;


            if (arr[mid] <= key){

                count = mid + 1;
                left = mid + 1;
            }


            else
                right = mid - 1;
        }
        return count;
    }
    static int[] collections_toArray(ArrayList<Integer> list){
        int a[] = new int[list.size()];

        for(int i =0;i<list.size();i++){
            a[i] = list.get(i);
        }

        return a;
    }

    public static long phi(long n)  //euler totient/phi function
    {
        long ans = n;
//       for(long i = 2;i*i<=n;i++)
//       {
//    	   if(n%i == 0)
//    	   {
//    		   while(n%i == 0) n/=i;
//    		   ans -= (ans/i);
//    	   }
//       }
//
//       if(n > 1)
//       {
//    	   ans -= (ans/n);
//       }

        for(long i = 2;i<=n;i++)
        {
            if(isPrime(i))
            {
                ans -= (ans/i);
            }
        }

        return ans;

    }
    public static long nCrModP(long n, long r,long p)
    {
        if (n<r)
            return 0;

        if (r == 0)
            return 1;

        long[] fac = new long[(int)(n) + 1];
        fac[0] = 1;

        for (int i = 1; i <= n; i++)
            fac[i] = fac[i - 1] * i % p;

        return (fac[(int)(n)] * modInverse(fac[(int)(r)], p)
                % p * modInverse(fac[(int)(n - r)], p)
                % p)
                % p;
    }

    public static long fact(long n)
    {
        long[] fac = new long[(int)(n) + 1];
        fac[0] = 1;

        for (long i = 1; i <= n; i++)
            fac[(int)(i)] = fac[(int)(i - 1)] * i;

        return fac[(int)(n)];
    }

    public static long nCr(long n, long k)
    {
        long ans = 1;
        for(long i = 0;i<k;i++)
        {
            ans *= (n-i);
            ans /= (i+1);
        }
        return ans;
    }

    //Modular Operations for Addition and Multiplication.
    public static long perfomMod(long x)
    {
        return ((x%M + M)%M);
    }
    public static long addMod(long a, long b)
    {
        return perfomMod(perfomMod(a)+perfomMod(b));
    }

    public static long subMod(long a, long b)
    {
        return perfomMod(perfomMod(a)-perfomMod(b));
    }

    public static long mulMod(long  a, long b)
    {
        return perfomMod(perfomMod(a)*perfomMod(b));
    }

    public static boolean isPrime(long n)
    {
        if(n == 1)
        {
            return false;
        }
        for(int i = 2;i*i<=n;i++)
        {
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static long fastPow(long x, long n)
    {
        if(n == 0)
            return 1;
        else if(n%2 == 0)
            return fastPow(x*x,n/2);
        else
            return x*fastPow(x*x,(n-1)/2);
    }

    public static long modPow(long x, long y, long p)
    {
        long res = 1;
        x = x % p;

        while (y > 0) {
            if (y % 2 == 1)
                res = (res * x) % p;

            y = y >> 1;
            x = (x * x) % p;
        }
        return res;
    }

    static long modInverse(long n, long p)
    {
        return modPow(n, p - 2, p);
    }

    static boolean sqrt(long n) {
        long div = (long)Math.sqrt(n);

        if(div*div==n) {
            return true;
        }
        else {
            return false;
        }
    }
    static ArrayList<Integer> divisors(int num) {
        int divisors = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                list.add(i);
                if (num / i != i) {
                    list.add(num/i);
                }
            }
        }
        return list;
    }

    public static int SOD(){
        int limit = (int) 10;

        int sod[] = new int[limit+1];
        for (int i = 1;i<=limit;i++){
            for (int j = i;j<=limit;j+=i){
                sod[j]+=i;
            }
        }
        return 0;
    }

    static int countDivisors(int num) {
        int divisors = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                divisors++;
                if (num / i != i) {
                    divisors++;
                }
            }
        }
        return divisors;
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
    /* public static int N=(int) 1e7;
     public static boolean isPrime[] = new boolean[N + 1];
     static ArrayList<Integer> sieveGenerate() { // O(N lgN)

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

     */
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length())
            return result;

        int[] targetCharactersFreq = new int[128];

        for (char targetChar : p.toCharArray()) {
            targetCharactersFreq[targetChar]++;
        }

        int remainingCharToBeAnagram = p.length();
        int startWindowIndex = 0;
        int endWindowIndex = 0;

        while (endWindowIndex < s.length()) {

            char currentChar = s.charAt(endWindowIndex);

            if (targetCharactersFreq[currentChar] >= 1) {
                remainingCharToBeAnagram--;
            }
            targetCharactersFreq[currentChar]--;
            endWindowIndex++;

            if (remainingCharToBeAnagram == 0) {
                result.add(startWindowIndex);
            }

            int windowLength = endWindowIndex - startWindowIndex;

            if (windowLength == p.length()) {
                char currentStartWindowChar = s.charAt(startWindowIndex);

                if (targetCharactersFreq[currentStartWindowChar] >= 0) {
                    remainingCharToBeAnagram++;
                }
                targetCharactersFreq[currentStartWindowChar]++;
                startWindowIndex++;
            }
        }
        return result;
    }

    static long trailingZeros(long N) {
        long zeros = 0;
        for (long i = 5; N / i > 0; i *= 5) {
            zeros += N / i;
        }
        return zeros;
    }
    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
    private static boolean isPalindrom(String s) {

        return new StringBuilder(s).reverse().toString().equals(s);
    }

    public static void Sort(long[] a)
    {
        List<Long> l = new ArrayList<>();
        for (long i : a) l.add(i);
        Collections.sort(l);
//		Collections.reverse(l);  //Use to Sort decreasingly
        for (int i=0; i<a.length; i++) a[i]=l.get(i);
    }

    public static void ssort(char[] a)
    {
        List<Character> l = new ArrayList<>();
        for (char i : a) l.add(i);
        Collections.sort(l);
        for (int i=0; i<a.length; i++) a[i]=l.get(i);
    }

    public static String Intersection(){

        int ara[] = new int[100];//how many points

        int left  = Integer.MIN_VALUE;
        int right = Integer.MAX_VALUE;
        int ans= 0;
        for(int i = 1;i<=ara.length;i++){
            int l =100,r=200;//points
            if(l>r){
                int temp = l;
                l = r;
                r =temp;
            }
            left= Math.max(l,left);
            right =Math.min(r,right);
        }
        return left+" "+right;
    }


    public static boolean isPow2(long n)
    {
        return (n  != 0 && ((n & (n-1))) == 0);
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < arr[i - 1])
                return false;
        return true;
    }


    static class FastReader {
        InputStream is;
        private byte[] inbuf = new byte[1024];
        private int lenbuf = 0, ptrbuf = 0;

        public FastReader(InputStream is) {
            this.is = is;
        }

        public int readByte() {
            if (lenbuf == -1) throw new InputMismatchException();
            if (ptrbuf >= lenbuf) {
                ptrbuf = 0;
                try {
                    lenbuf = is.read(inbuf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (lenbuf <= 0) return -1;
            }
            return inbuf[ptrbuf++];
        }

        public boolean isSpaceChar(int c) {
            return !(c >= 33 && c <= 126);
        }

        private boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        public int skip() {
            int b;
            while ((b = readByte()) != -1 && isSpaceChar(b)) ;
            return b;
        }

        public String next() {
            int b = skip();
            StringBuilder sb = new StringBuilder();
            while (!(isSpaceChar(b))) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }


        public String nextLine() {
            int c = skip();
            StringBuilder sb = new StringBuilder();
            while (!isEndOfLine(c)) {
                sb.appendCodePoint(c);
                c = readByte();
            }
            return sb.toString();
        }

        public int nextInt() {
            int num = 0, b;
            boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            while (true) {
                if (b >= '0' && b <= '9') {
                    num = (num << 3) + (num << 1) + (b - '0');
                } else {
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }

        public long nextLong() {
            long num = 0;
            int b;
            boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
            if (b == '-') {
                minus = true;
                b = readByte();
            }

            while (true) {
                if (b >= '0' && b <= '9') {
                    num = (num << 3) + (num << 1) + (b - '0');
                } else {
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
        public char[] next(int n) {
            char[] buf = new char[n];
            int b = skip(), p = 0;
            while (p < n && !(isSpaceChar(b))) {
                buf[p++] = (char) b;
                b = readByte();
            }
            return n == p ? buf : Arrays.copyOf(buf, p);
        }

        public char readChar() {
            return (char) skip();
        }
    }

    static class Tuple implements Comparable<Tuple>
    {
        int first, second,third;
        public Tuple(int first, int second, int third)
        {
            this.first = first;
            this.second = second;
            this.third = third;
        }
        public int compareTo(Tuple o)
        {
            return (int)(o.third - this.third);
        }
    }


    public static class DSU
    {
        int[] parent;
        int[] rank; //Size of the trees is used as the rank
        public DSU(int n)
        {
            parent = new int[n];
            rank = new int[n];
            Arrays.fill(parent, -1);
            Arrays.fill(rank, 1);
        }

        public int find(int i) //finding through path compression
        {
            return parent[i] < 0 ? i : (parent[i] = find(parent[i]));
        }

        public boolean union(int a, int b) //Union Find by Rank
        {
            a = find(a);
            b = find(b);

            if(a == b) return false; //if they are already connected we exit by returning false.

            // if a's parent is less than b's parent
            if(rank[a] < rank[b])
            {
                //then move a under b
                parent[a] = b;
            }
            //else if rank of j's parent is less than i's parent
            else if(rank[a] > rank[b])
            {
                //then move b under a
                parent[b] = a;
            }
            //if both have the same rank.
            else
            {
                //move a under b (it doesnt matter if its the other way around.
                parent[b] = a;
                rank[a] = 1 + rank[a];
            }
            return true;
        }
    }
    public static int N=(int) 1e6;
    public static boolean isPrime[] = new boolean[N + 1];
    static void sieve() { // O(N lgN)

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

}
