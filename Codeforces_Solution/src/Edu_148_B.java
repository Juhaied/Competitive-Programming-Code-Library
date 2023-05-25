import java.io.PrintWriter;
import java.util.*;

public class Edu_148_B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int test = in.nextInt();
        for(int t = 1;t<=test;t++){
            int n = in.nextInt(),cnt  = 0;
            String s = in.next();
            int c1 = 0,c2 = 0;
            int a1  = -1,a2 = -1;
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i)=='<'){
                    c1++;

                    a2 = Math.max(a2,c2);
                    c2 = 0;
                }
                else {
                    c2++;
                    a1 = Math.max(a1,c1);
                    c1=0;
                }
            }

            int max= Math.max(c1,c2);

            max= Math.max(max,Math.max(a1,a2));
            pw.println(max+1);
        }
        pw.close();

    }

    static  void debug(Object...obj){
        System.err.println(Arrays.deepToString(obj));
    }
}