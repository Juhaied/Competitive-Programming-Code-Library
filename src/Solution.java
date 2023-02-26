class Solution {
    public static int[] leftRigthDifference(int[] nums) {
        int a[] = new int[nums.length];

        int left[] = new int[nums.length];
        left[0] = nums[0];



        for(int i =1;i< nums.length;i++){
            left[i] = left[i-1]+nums[i];
        }

        int l_arr[] = new int[nums.length];

        for(int i = 1;i< nums.length;i++){
            l_arr[i] = left[i-1];
        }


        int rev[] = new int[nums.length];
        int j = nums.length-1;
        for(int i = 0;i< nums.length;i++){
            rev[i] = nums[j];
            j--;
        }

        int right[] = new int[nums.length];

        right[0] = rev[0];
        for(int i =1;i< nums.length;i++){
            right[i] = right[i-1]+rev[i];
        }


        int rev_arr[] = new int[nums.length];

        for(int i = 1;i< nums.length;i++){
            rev_arr[i] = right[i-1];
        }
        int r_arr[] = new int[nums.length];
        int jj = nums.length-1;
        for(int i =0;i< nums.length;i++){
            r_arr[i] = rev_arr[jj];
            jj--;
        }


        for(int i = 0;i< nums.length;i++){
            a[i] = Math.abs(l_arr[i]-r_arr[i]);
        }
        return a;
    }
}