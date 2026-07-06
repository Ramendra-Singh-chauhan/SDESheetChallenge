class Solution {
    public int subarraySum(int[] nums, int k) {
        // int count = 0;
        // for(int i = 0 ; i<nums.length ; i++){
        //     int sum = 0 ;
        //     for(int j =  i ; j<nums.length ; j++){
        //         sum+=nums[j];
        //         if(sum==k) count++;
        //     }
        // }
        // return count;

        // optimal approach 
        int  n = nums.length;
        int count = 0 ;
        int[] prefixSum = new int[n];
        prefixSum[0]=nums[0];
        for(int i=1; i<n; i++){
            prefixSum[i]=prefixSum[i-1]+nums[i];
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            if(prefixSum[i]==k) count++;
            int value = prefixSum[i]-k;
            if(map.containsKey(value)) count=count+map.get(value);
            map.put(prefixSum[i], map.getOrDefault(prefixSum[i],0)+1);
        }
        return count++;
    }
}