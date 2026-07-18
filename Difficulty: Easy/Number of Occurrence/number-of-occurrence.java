class Solution {
    public int firstOccurance(int[] arr , int target){
        int n = arr.length;
        int ans = -1;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                ans=mid;
                high=mid-1;
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public int lastOccurance(int[] arr , int target){
        int n = arr.length;
        int low = 0;
        int ans = -1;
        int high = n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                ans=mid;
                low=mid+1;
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    int countFreq(int[] arr, int target) {
        int first  = firstOccurance(arr , target);
        int last = lastOccurance(arr , target);
        int ans=last-first;
        if(first!=-1 ){
            ans = (last-first)+1;
            return ans;
        }
        return ans;
    }
}
