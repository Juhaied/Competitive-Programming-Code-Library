import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Edu_148_A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int test = in.nextInt();
        for(int t = 1;t<=test;t++){
            int n = in.nextInt(), x = in.nextInt();

            if(n %x !=0){
                pw.println(1);
                pw.println(n);
            }
            else {
                pw.println(2);
                pw.println(n-1+" "+(1));
            }
        }
        pw.close();

    }

    static  void debug(Object...obj){
        System.err.println(Arrays.deepToString(obj));
    }
}
