import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int test = in.nextInt();
        for(int t=1;t<=test;t++) {
            int n = in.nextInt();
            String s = in.next();

            boolean flag = true;

            for(int i = 0;i<s.length()-1;i++){
                if(s.charAt(i)==s.charAt(i+1)){
                    flag = false;
                    break;
                }
            }

            if(!flag){
                pw.println("NO");
            }
            else {
                boolean ans = true;
                HashMap<Character,Integer> map = new HashMap<>();

                for(int i = 0;i<s.length();i++){
                    char ch = s.charAt(i);
                    if(map.containsKey(ch)){
                        int val = map.get(ch);

                        if(((val % 2)== (i % 2))){
                            map.put(ch,i);
                        }
                        else{
                            ans= false;
                            break;
                        }
                    }
                    else {
                        map.put(ch,i);
                    }
                }

               // debug(map);

                if(ans){
                    pw.println("YES");
                }
                else {
                    pw.println("NO");
                }
            }
        }
        pw.close();
    }



    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
