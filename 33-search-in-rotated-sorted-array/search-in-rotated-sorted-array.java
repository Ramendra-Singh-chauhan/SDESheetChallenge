class Solution {
    // brute force
    // int findK(int[] arr){
    //     int n=arr.length;
    //     int k = 0 ;
    //     for(int i=1 ; i<arr.length ; i++){
    //         if(arr[i]>=arr[i-1]){
    //             continue;
    //         }
    //         else{
    //             k=i-1;
    //         }
    //     }
    //     return k;
    // }
    // int binarySearch(int[] arr , int low , int high , int target){
    //     while(low<=high){
    //         int mid=(low+high)/2;
    //         if(arr[mid]==target) return mid;
    //         else if(arr[mid]<target){
    //             low=mid+1;
    //         }
    //         else{
    //             high=mid-1;
    //         }
    //     }
    //     return -1;
    // }
    public int search(int[] nums, int target) {
        // brute force
        // int k=findK(nums);
        // int n = nums.length;
        // int low=0;
        // int high=n-1;
        // int mid= (low+high)/2;
        // int ans=binarySearch(nums , 0 , mid , target);
        // if(ans!=-1) return ans;
        // return binarySearch(nums , mid+1 , n-1 , target);

        // optimal 
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target) return mid;

            // left side is sorted
            if(nums[low]<=nums[mid]){
                if(target>=nums[low] && target<=nums[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(target>nums[mid] && target<=nums[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}