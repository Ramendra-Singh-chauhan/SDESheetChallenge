class Solution {
    public int singleNonDuplicate(int[] nums) {
        // brute force
        int single=0;
        for(int i=0 ; i<nums.length ; i++){
            single=single^nums[i];
        }
        return single;

        // better

        // HashMap<Integer , Integer> map = new HashMap<>();
        // for(int i=0 ; i<nums.length ; i++){
        //     map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
        // }
        // for(int key : map.keySet()){
        //     if(map.get(key)==1){
        //         return key;
        //     }
        // }
        // return -1;
    }
}