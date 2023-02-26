import java.io.*;
import java.util.*;

public class Atcoder_291_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt();
        String s = in.next();
        char ch[] = s.toCharArray();


        ArrayList<String >list = new ArrayList<>();

        boolean flag = true;
        int left = 0, right = 0;
        for(int i = 0;i<n;i++){
            if(ch[i]=='R'){
                right++;
            }
            else if(ch[i]=='L'){
                right--;
            }
            else if(ch[i]=='U'){
                left++;
            }
            else {
                left--;
            }

            list.add(right+" "+left);

        }

        list.add(0+" "+0);
        HashSet<String> set = new HashSet<>();

        for(int i = 0;i<list.size();i++){
            set.add(list.get(i));
        }

        if(set.size()== list.size()){
            pw.println("No");
        }
        else {
            pw.println("Yes");
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
