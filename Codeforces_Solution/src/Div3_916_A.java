import java.io.PrintWriter;
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Div3_916_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int test = in.nextInt();

        for(int t = 1;t<=test;t++){
            int n = in.nextInt();
            String s = in.next();

            Map<Character,Integer> map = new HashMap<>();

            for (int i = 0;i<n;i++){
                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i),map.get(s.charAt(i))+1);
                }
                else {
                    map.put(s.charAt(i),1);
                }
            }
            int ans = 0;
            int val = 1;
            for (char ch = 'A' ; ch<='Z';ch++){
                if(map.containsKey(ch)){
                    if(map.get(ch)>=val){
                        ans++;
                    }
                }

                val++;
            }

            pw.println(ans);
        }

        pw.close();
    }
}