import java.io.*;
import java.util.*;

public class Sliding_Window{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String s = "Code and Code";
        String p = "Co";
        debug(findAnagrams(s,p));
        pw.close();
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length())
            return result;

        int[] targetCharactersFreq = new int[128];

        for (char targetChar : p.toCharArray()) {
            targetCharactersFreq[targetChar]++;
        }

        int remainingCharToBeAnagram = p.length();
        int startWindowIndex = 0;
        int endWindowIndex = 0;

        while (endWindowIndex < s.length()) {

            char currentChar = s.charAt(endWindowIndex);

            if (targetCharactersFreq[currentChar] >= 1) {
                remainingCharToBeAnagram--;
            }
            targetCharactersFreq[currentChar]--;
            endWindowIndex++;

            if (remainingCharToBeAnagram == 0) {
                result.add(startWindowIndex);
            }

            int windowLength = endWindowIndex - startWindowIndex;

            if (windowLength == p.length()) {
                char currentStartWindowChar = s.charAt(startWindowIndex);

                if (targetCharactersFreq[currentStartWindowChar] >= 0) {
                    remainingCharToBeAnagram++;
                }
                targetCharactersFreq[currentStartWindowChar]++;
                startWindowIndex++;
            }
        }
        return result;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
