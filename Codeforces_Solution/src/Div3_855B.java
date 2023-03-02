import java.io.*;
import java.util.*;

public class Div3_855B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), k = in.nextInt();

            String s = in.next();

            ArrayList<Character> l1 = new ArrayList<>();

            l1.add('a');
            l1.add('b');
            l1.add('c');
            l1.add('d');
            l1.add('e');
            l1.add('f');l1.add('g');l1.add('h');l1.add('i');l1.add('j');l1.add('k');l1.add('l');l1.add('m');l1.add('n');
            l1.add('o');l1.add('p');l1.add('q');l1.add('r');l1.add('s');l1.add('t');l1.add('u');l1.add('v');l1.add('w');
            l1.add('x');l1.add('y');l1.add('z');


            ArrayList<Character> l2 = new ArrayList<>();

            l2.add('A');
            l2.add('B');l2.add('C');l2.add('D');l2.add('E');l2.add('F');l2.add('G');l2.add('H');l2.add('I');l2.add('J');l2.add('K');l2.add('L');
            l2.add('M');l2.add('N');l2.add('O');l2.add('P');l2.add('Q');l2.add('R');l2.add('S');l2.add('T');l2.add('U');l2.add('V');l2.add('W');
            l2.add('X');l2.add('Y');l2.add('Z');


            Map<Character,Integer> lower = new HashMap<>();
            Map<Character,Integer> upper = new HashMap<>();


            for(int i = 0;i<s.length();i++){
                char ch = s.charAt(i);

                if(upper.containsKey(ch)){
                    upper.put(ch,upper.get(ch)+1);
                }
                else {
                    if(ch>='A' && ch<='Z'){
                        upper.put(ch,1);
                    }
                }

                if(lower.containsKey(ch)){
                    lower.put(ch,lower.get(ch)+1);
                }
                else {
                    if(ch>='a' && ch<='z'){
                        lower.put(ch,1);
                    }
                }
            }
            long answer = 0;
            for(int i = 0;i<26;i++){
                char c1 = l1.get(i);
                char c2 = l2.get(i);

                int min =0;
                if(lower.containsKey(c1) && upper.containsKey(c2)) {
                    min = Math.min(lower.get(c1), upper.get(c2));

                    answer += min;


                    int max = Math.max(lower.get(c1), upper.get(c2));

                    max -= min;

                    max /= 2;

                    int aromin = Math.min(max, k);

                    answer += aromin;
                    k -= aromin;

                }
                else if(lower.containsKey(c1)){
                    int max = Math.max(lower.get(c1), 0);

                    max -= min;

                    max /= 2;

                    int aromin = Math.min(max, k);

                    answer += aromin;
                    k -= aromin;
                } else if (upper.containsKey(c2)) {
                    int max = Math.max(upper.get(c2), 0);

                    max -= min;

                    max /= 2;

                    int aromin = Math.min(max, k);

                    answer += aromin;
                    k -= aromin;
                }
            }


            pw.println(answer);

        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
