import java.io.*;
import java.util.*;

public class Edu_148_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            String s = in.next();

            if(s.length()==2){
                pw.println("NO");
            }
            else {
                HashSet<Character> set = new HashSet<>();
             //   HashMap<Character,Integer> map = new HashMap<>();

                for(int i = 0;i<s.length()/2;i++){
                    char ch = s.charAt(i);

                    set.add(ch);
                }

                if(set.size()==1){
                    pw.println("NO");
                }
                else {
                    pw.println("YES");
                }


            }

        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
