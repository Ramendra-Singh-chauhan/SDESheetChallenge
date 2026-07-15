class Solution {
    static int findFloor(int[] arr, int x) {
        // code here
        int n = arr.length;
        int low = 0;
        // int ans = -1;
        int high = n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                low=mid+1;
            }
            else if(x>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return high;
    }
}
