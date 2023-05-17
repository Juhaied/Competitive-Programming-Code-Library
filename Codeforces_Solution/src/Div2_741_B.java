import java.io.*;
import java.util.*;

public class Div2_741_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int num= in.nextInt();
            String s = in.next();


            char ch =contains(s);

            if(ch=='1' || ch=='4' || ch=='6' || ch=='8'|| ch=='9'){
                pw.println(1);
                pw.println(ch);
            }
            else {
               int val = 0;
               int ans = 0;
               boolean flag = false;
               for(int i = 0;i<s.length();i++){
                   for(int j = i+1;j<s.length();j++){
                       val = s.charAt(i)-'0';
                       val*=10;
                       val+=s.charAt(j)-'0';

                      // debug(val);

                       if(!isPrime(val)){
                           ans=val;
                           flag = true;
                           break;
                       }
                   }

                   if(flag){
                       break;
                   }
               }

               pw.println(2);
               pw.println(ans);

            }
        }
        pw.close();
    }

    public static char contains(String s){
        char ch ='0';
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='1' ||s.charAt(i)=='4' || s.charAt(i)=='6' || s.charAt(i)=='8' || s.charAt(i)=='9'){
                ch=s.charAt(i);
                break;
            }
        }

        return ch;
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

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
