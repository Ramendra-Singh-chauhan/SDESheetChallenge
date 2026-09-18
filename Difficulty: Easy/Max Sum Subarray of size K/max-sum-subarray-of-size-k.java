class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int sum = 0;
        int maxSum = 0;
        for(int i=0 ; i<k ; i++){
            sum+=arr[i];
        }
        maxSum=sum;
        
        for(int i=k ; i<arr.length ; i++){
            sum=sum-arr[i-k]+arr[i];
            if(sum>maxSum) maxSum = sum;
        }
        return maxSum;
    }
}