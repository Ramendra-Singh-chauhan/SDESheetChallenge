class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Brute force Approach

        // int [] arr = new int[2];
        // for(int i = 0 ; i<nums.length-1 ; i++){
        //     for(int j = i+1 ; j<nums.length ; j++){
        //         if(nums[i]+nums[j]==target) {
        //             arr[0]=i;
        //             arr[1]=j;
        //         }
        //     }            
        // }
        // return arr;


        // Better approach


        HashMap <Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i<nums.length ; i++){
            int first = nums[i];
            int second = target - first;
            if(map.containsKey(second)){
                return new int[]{map.get(second), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};

        // Optimal approach:- sliding window
        
        // Arrays.sort(nums);
        // int first = 0;
        // int second = nums.length-1;
        // while(first<second){
        //     if(nums[first]+nums[second]==target) return new int[]{first,second};
        //     else if(nums[first]+nums[second]>target) second--;
        //     else if(nums[first]+nums[second]<target) first++;    
        // }
        // return new int[]{};
    }
}