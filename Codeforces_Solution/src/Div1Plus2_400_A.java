import java.io.*;
import java.util.*;

public class Div1Plus2_400_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        Stack<String> stk = new Stack<>();

        String s1 = in.next(),s2 = in.next();
        stk.push(s1);
        stk.push(s2);
        pw.println(s1+" "+s2);
        int n = in.nextInt();
        for(int i = 0;i<n;i++){
            String killed = in.next(),replaced = in.next();
            stk.removeElement(killed);
            pw.println(stk.peek()+" "+replaced);
            stk.push(replaced);
        }


        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
