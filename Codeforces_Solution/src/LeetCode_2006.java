import java.io.*;
import java.util.*;

public class LeetCode_2006 {
    public int countKDifference(int[] nums, int k) {
        int ans  = 0;

        for (int i = 0;i<nums.length-1;i++){
            for (int j =i+1;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])==k){
                    ans++;
                }
            }
        }
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
