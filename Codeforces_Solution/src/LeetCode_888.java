import java.io.*;
import java.util.*;

public class LeetCode_888 {
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int ans[] = new int[2];
        int sum1 = 0;
        int sum2  = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int alice :aliceSizes){
            sum1+=alice;
            set.add(alice);
        }
        for (int bob:bobSizes){
            sum2+=bob;
        }

        int diff = (sum1-sum2)/2;

        for (int i = 0;i<bobSizes.length;i++){
            int target = diff+bobSizes[i];

            if(set.contains(target)){
                return new int[]{target,bobSizes[i]};
            }
        }
        return null;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
