import java.io.*;
import java.util.*;

public class Div3_501_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        String s1 = in.next();
        String s2 = in.next();

        HashMap<Character,Integer> m1 = new HashMap<>();
        HashMap<Character,Integer> m2 = new HashMap<>();

        for(int i = 0;i<n;i++){
            char c1 = s1.charAt(i);

            if(!m1.containsKey(c1)){
                m1.put(c1,1);
            }
            else {
                m1.put(c1,m1.get(c1)+1);
            }

            char c2 = s2.charAt(i);

            if(!m2.containsKey(c2)){
                m2.put(c2,1);
            }
            else {
                m2.put(c2,m2.get(c2)+1);
            }
        }

        boolean flag = true;

        for(char c:m1.keySet()){
            int v = m1.get(c);
            if(m2.containsKey(c)) {
                int v2 = m2.get(c);

                if (v != v2) {
                    flag = false;
                    break;
                }
            }
            else {
                flag = false;
                break;
            }

        }


        if(flag){
            ArrayList<Integer> ans = new ArrayList<>();
            char ch1[] = s1.toCharArray();
            char ch2[] = s2.toCharArray();
            String str = "";
            int cnt = 0;
            for(int i = 0;i<n;i++) {
                if(ch1[i]==ch2[i]){
                    continue;
                }
                else {
                    int j = i+1;
                    while (j<n && ch1[j]!=ch2[i]){
                        j++;
                    }

                    if(j==n){
                        pw.println(-1);
                        System.exit(0);
                    }
                    else {
                        for(int k = j;k>=i+1;k--){
                            str=str+k+" ";
                            cnt++;
                            char temp = ch1[k];
                            ch1[k]=ch1[k-1];
                            ch1[k-1]=temp;
                        }
                    }
                }
            }

            pw.println(cnt);
            pw.println(str);
        }
        else {
            pw.println(-1);
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
