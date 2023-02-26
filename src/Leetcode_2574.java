import java.io.*;
import java.util.*;

public class Leetcode_2574 {
    public static int[] leftRigthDifference(int[] nums) {
        int a[] = new int[nums.length];
        int n = nums.length;
        int left[] = new int[n];
        left[0] = 0;
        for(int i=1;i<n;i++){
            left[i] = nums[i-1]+left[i-1];
        }
        int right[] = new int[n];
        right[n-1] = 0;
        for(int i=n-2;i>=0;i--){
            right[i] = right[i+1]+nums[i+1];
        }

        for(int i = 0;i<n;i++){
            a[i] = Math.abs(left[i]-right[i]);
        }
        return a;
    }

}
