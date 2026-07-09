class Solution {
    public int maxSubArray(int[] nums) {
        // Optimal Approach
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        if(nums.length==1) return nums[0];
        for(int i=0; i<nums.length ; i++){
            sum+=nums[i];
            maxi=Math.max(maxi,sum);
            if(sum<0){
                sum=0;
            }
        }
        return maxi;



        // brute force 
        // int maxi = Integer.MIN_VALUE;
        // int length = 0;
        // if(nums.length==1) return nums[0];
        // for(int i=0 ; i<nums.length ; i++){
        //     int sum = 0;
        //     for(int j=i; j<nums.length ; j++){
        //         sum = sum+nums[j];
        //         maxi = Math.max(maxi , sum);
        //     }
        // }
        // return maxi;
  }
}
