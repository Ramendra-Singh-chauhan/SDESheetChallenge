class Solution {
    int IfPossible(int[] arr, int mid){
        int days=1;
        int load=0;
        for(int i=0 ; i<arr.length ; i++){
            if(load+arr[i]>mid){
                days=days+1;
                load=arr[i];
            }
            else{
                load+=arr[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        // max weight 
        int max=weights[0];
        for(int i=0 ; i<weights.length ; i++){
            if(weights[i]>max){
                max=weights[i];
            }
        }

        // sum of weights
        int sum=0;
        for(int i=0 ; i<weights.length ; i++){
            sum+=weights[i];
        }

        int low=max;
        int high=sum;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;

            int IfPossibleAns = IfPossible(weights, mid);
            if(IfPossibleAns<=days){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}