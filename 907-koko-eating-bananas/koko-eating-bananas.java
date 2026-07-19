class Solution {
    long CalculateHours(int[] arr , int h , int mid){
        long hours = 0;
        for(int i=0 ; i<arr.length ; i++){
            hours += (arr[i] + mid - 1) / mid;
        }
        return hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        
        int max=piles[0];
        for(int i=0 ; i<piles.length ; i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        
        int ans=0;
        int low=1;
        int high=max;
        while(low<=high){
            int mid=(low+high)/2;
            
            long possible=CalculateHours(piles , h , mid);
            if(possible<=h){
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