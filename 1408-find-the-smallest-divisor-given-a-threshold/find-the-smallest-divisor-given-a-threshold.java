class Solution {
    int SmallestDivisor(int[] arr, int divisor){
        int SD=0;
        for(int i=0 ; i<arr.length ; i++){
            // SD+= arr[i]/divisor;
            SD += (arr[i] + divisor - 1) / divisor;
        }
        return SD;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max=nums[0];
        for(int i=1 ; i<nums.length ; i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }

        int ans=0;
        int n=nums.length;
        int low=1;
        int high=max;
        while(low<=high){
            int mid=(low+high)/2;
     
            int SDV = SmallestDivisor(nums , mid);
            if(SDV<=threshold){
                high=mid-1;
                ans=mid;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}