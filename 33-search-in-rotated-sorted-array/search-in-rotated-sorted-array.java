class Solution {
    // brute force
    int findK(int[] arr){
        int k=0;
        for(int i=0 ; i<arr.length-1 ; i++){
            if(arr[i+1]>arr[i]){
                continue;
            }
            else{
                k=i;
            }
        }
        return k;
    }
    int BinarySearch(int[] arr , int low , int high, int target){
        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==target) return mid;

            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        // brute force
        int n = nums.length;
        int k = findK(nums);
        int ans = BinarySearch(nums , 0 , k , target);
        if(ans!=-1) return ans;
        return BinarySearch(nums,k+1,n-1,target);
        // // optimal 
        // int n=nums.length;
        // int low=0;
        // int high=n-1;
        // while(low<=high){
        //     int mid=(low+high)/2;
        //     if(nums[mid]==target) return mid;

        //     // left side is sorted
        //     if(nums[low]<=nums[mid]){
        //         if(target>=nums[low] && target<=nums[mid]){
        //             high=mid-1;
        //         }
        //         else{
        //             low=mid+1;
        //         }
        //     }
        //     // right side is sorted
        //     else{
        //         if(target>nums[mid] && target<=nums[high]){
        //             low=mid+1;
        //         }
        //         else{
        //             high=mid-1;
        //         }
        //     }
        // }
        // return -1;
    }
}