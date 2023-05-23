import java.io.*;
import java.util.*;

public class Div1_516_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt();
        char ch[] = in.next().toCharArray();
        Arrays.sort(ch);
        for(char c:ch){
            pw.print(c);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
