class Solution {
    public int longestOnes(int[] nums, int k) {
        // brute force
        // int maxlength=0;
        // for(int i=0 ; i<nums.length ; i++){
        //     int zero=0;
        //     for(int j=i ; j<nums.length ; j++){
        //         int length=0;
        //         if(nums[j]==0) zero++;
        //         if(zero<=k) {
        //             length=j-i+1;
        //             maxlength=Math.max(length,maxlength);
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        // return maxlength;

        // Better Approach
        int maxlength=0 , l=0 , r=0 , zeros=0 ;
        while(r<nums.length){
            int length=0;
            if(nums[r]==0) zeros++;
            while(zeros>k){
                if(nums[l]==0){
                    zeros--;
                }
                l++;
            }
                length=r-l+1;
                maxlength=Math.max(length,maxlength);
                r++; 
        }
        return maxlength;
    }
}