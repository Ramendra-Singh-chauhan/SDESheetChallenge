class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        for(int i = 0 ; i<n ; i++){
            int count = 0;
            for(int j = 0 ; j<n ; j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1) return nums[i];
        }
        return -1;
        // HashMap<Integer , Integer> map = new HashMap<>();
        // for(int i = 0 ; i<nums.length ; i++){
        //     map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        // }
        // for(int key : map.keySet()){
        //     if(map.get(key)==1){
        //         return key;
        //     }
        // }
        // return -1;
    }
}