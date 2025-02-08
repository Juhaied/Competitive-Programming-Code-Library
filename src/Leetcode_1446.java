import java.io.*;
import java.util.*;

public class Leetcode_1446 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        pw.println(maxPower("acde"));
        pw.close();
    }

    public static int maxPower(String s) {
        int max = 0,count = 0;
        char ch [] = s.toCharArray();
        for (int i = 0;i<s.length()-1;i++){
            if(ch[i]==ch[i+1]){
                count++;
            }
            else{
                max = Math.max(max,count);
                count= 0;
            }
        }
        max = Math.max(max,count);

        return max+1;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
