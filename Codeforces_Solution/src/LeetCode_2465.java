import java.io.*;
import java.util.*;

public class LeetCode_2465 {
    public static int distinctAverages(int[] nums) {
        int ans  = 0;

        Map<Double,Integer> map = new HashMap<>();

        Arrays.sort(nums);

        for (int i = 0;i<nums.length/2;i++){
            double value = nums[i]+nums[nums.length-1-i];

            value = (value*100)/100.0;
            value/=2;

            map.put(value,1);
        }

        ans = map.size();
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
