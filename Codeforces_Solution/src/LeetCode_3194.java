import java.io.*;
import java.util.*;

public class LeetCode_3194 {
    public static double minimumAverage(int[] nums) {

        double min = Double.MAX_VALUE;
        Arrays.sort(nums);

        for (int i = 0;i<nums.length/2;i++){
            double value = nums[i]+nums[nums.length-1-i];

            value = (value*100)/100.0;
            value/=2;

            min = Math.min(value,min);
        }

        return min;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
