class Solution {
    boolean possible(int[] arr , int m ,int k , int day){
        int count=0;
        int NoOfB=0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]<=day){
                count++;
            }
            else{
                NoOfB+=(count/k);
                count=0;
            }
        }
        NoOfB+=(count/k);
        if(NoOfB>=m) return true;
        return false;
    }
    public int minDays(int[] nums, int m, int k) {
        int n=nums.length;
        if(n<m*k) return -1;

        int min=nums[0];
        for(int i=1 ; i<nums.length ; i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }

        int max=nums[0];
        for(int i=1 ; i<nums.length ; i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        // brute force
        // for(int i=min ; i<=max ; i++){
        //     if(possible(nums , m , k ,i)==true) return i; 
        // }
        // return -1;

        // optimal
        int low=min;
        int high=max;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;

            if(possible(nums,m,k,mid)==true){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(ans>0)return ans;
        return -1;
    }
}