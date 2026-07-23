class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlength=0;
        for(int i=0 ; i<nums.length ; i++){
            int zero=0;
            for(int j=i ; j<nums.length ; j++){
                int length=0;
                if(nums[j]==0) zero++;
                if(zero<=k) {
                    length=j-i+1;
                    maxlength=Math.max(length,maxlength);
                }
                else{
                    break;
                }
            }
        }
        return maxlength;
    }
}