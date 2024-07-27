import java.io.*;
import java.util.*;

public class LeetCode_2824 {
    public static int countPairs(List<Integer> nums, int target) {
        int ans = 0;
        Collections.sort(nums);
        int i = 0, j = nums.size()-1;

        while (i<j){
            if(nums.get(i)+nums.get(j)<target){
                i++;
                ans+=j-i+1;
            }
            else{
                j--;
            }
        }

        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
