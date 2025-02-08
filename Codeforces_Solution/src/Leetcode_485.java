import java.io.*;
import java.util.*;

public class Leetcode_485 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int a[] = {1,0,0,1,1,1};
        pw.println(findMaxConsecutiveOnes(a));
        pw.close();
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = Integer.MIN_VALUE, count = 0;

        for(int i = 0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else {
                max = Math.max(count,max);
                count = 0;
            }
        }

        max = Math.max(count,max);

        return max;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
