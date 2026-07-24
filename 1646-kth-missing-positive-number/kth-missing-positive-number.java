class Solution {
    public int findKthPositive(int[] arr, int k) {
        // brute force Approach TC-> O(N) and SC->O(1)
        // for(int i=0 ; i<arr.length ; i++){
        //     if(arr[i]<=k) k++;
        //     else break;
        // }
        // return k;

        // Optimal Approach
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]-(mid+1)<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low+k;
    }
}