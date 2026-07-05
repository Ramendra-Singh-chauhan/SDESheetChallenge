class Solution {
    public int singleNumber(int[] nums) {
        //Brute force :- O(N*N) nested loop

        // int n = nums.length;
        // for(int i = 0 ; i<n ; i++){
        //     int count = 0;
        //     for(int j = 0 ; j<n ; j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count==1) return nums[i];
        // }
        // return -1;



        // better approach:- using hashing

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

        // optimal solution :- XOR 

        int XOR = 0;
        for(int i = 0 ; i<nums.length ; i++){
            XOR = XOR ^ nums[i];
        }
        return XOR;
    }
}