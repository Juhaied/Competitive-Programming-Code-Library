import java.io.*;
import java.util.*;

public class LeetCode_1608_Binary_search {
    public static void main(String[] args) {
        //Biinary searcj
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int a[] = {3,5};

        debug(specialArray(a));
        pw.close();
    }
    public static int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int l = 1, r = n, ans = -1;

        while (l <= r) {
            int mid = (l + r) / 2;
            int target= nums.length - LowerBound(nums, mid);

            if (target == mid) {
                ans = target;
                l = mid + 1;
            } else if (target < mid) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
    public static int LowerBound(int a[], long x)
    {
        int l=-1,r=a.length;
        while(l+1<r)
        {
            int m=(l+r)>>>1;
            if(a[m]>=x) r=m;
            else l=m;
        }
        return r;
    }
    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
