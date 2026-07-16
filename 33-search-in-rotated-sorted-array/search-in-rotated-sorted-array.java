class Solution {
    int findK(int[] arr){
        int n=arr.length;
        int k = 0 ;
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]>=arr[i-1]){
                continue;
            }
            else{
                k=i-1;
            }
        }
        return k;
    }
    int binarySearch(int[] arr , int low , int high , int target){
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
        int k=findK(nums);
        int n = nums.length;
        int ans=binarySearch(nums , 0 , k , target);
        if(ans!=-1) return ans;
        return binarySearch(nums , k+1 , n-1 , target);
    }
}