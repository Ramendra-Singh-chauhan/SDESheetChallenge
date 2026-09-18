class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double MaxAvg = Integer.MIN_VALUE;
        double sum=0;
        if(nums.length==1) return nums[0];
        for(int i=0 ; i<k ; i++){
            sum+=nums[i];
        }
        MaxAvg=(double)sum/k;

        for(int i=k ; i<nums.length ; i++){
            sum=sum-nums[i-k] + nums[i];
            if((double)sum/k>MaxAvg) MaxAvg=(double)sum/k;
        }
        return MaxAvg;
    }
}