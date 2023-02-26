import java.io.*;
import java.util.*;

public class Leetcode_242 {
    public static boolean isAnagram(String s, String t) {
        char c1[]=s.toCharArray();
        char c2[] = t.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(s.length()==t.length()) {
            boolean flag = true;
            for (int i = 0; i < s.length(); i++) {
                if (c1[i] != c2[i]) {
                    flag = false;
                    break;
                }
            }

            return flag;
        }
        else {
            return false;
        }
    }

}
