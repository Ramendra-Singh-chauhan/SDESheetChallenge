class Solution {
    public int findMin(int[] nums) {
        // brute force
        // int min = nums[0];
        // for(int i=1 ; i<nums.length ; i++){
        //     if(nums[i]<min){
        //         min=nums[i];
        //     }
        // }
        // return min;

        // better approach

        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<high){
            int mid=low+(high-low)/2;
        
            // matlab min element right meh hoga.
            if(nums[mid]>nums[high]){
                low=mid+1;
            }
            else{
                high=mid;
            }
        } 
        return nums[low];
    }
}