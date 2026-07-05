class Solution {
    public boolean check(int[] nums) {
    // brute force
        // int[] A = new int[nums.length];
        // int x = 0;
        // for(int i = 0 ;i<nums.length-1 ; i++){
        //    if(nums[i]>nums[i+1]){
        //     x=i+1;
        //    }
        // }
        // for(int i = 0 ; i<nums.length ; i++){
        //     A[i]=nums[(i+x) % nums.length ];
        // }
        // Arrays.sort(nums);
        // if(Arrays.equals(A,nums)) return true;
        // return false;

        // optimal approach
        int n = nums.length;
        int count = 0;
        for(int i = 1 ; i<n ; i++){
            if(nums[i-1]>nums[i]){
                count++;
            }
        }
        if(nums[n-1]>nums[0]) count++;
        if(count<=1) return true;
        return false;
    }
}