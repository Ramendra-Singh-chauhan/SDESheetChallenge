class Solution {
    public int findDuplicate(int[] nums) {
        //Bruteforce Approach1:-
        // int temp = 0;
        // Arrays.sort(nums);
        // for(int i = 0; i<nums.length-1; i++){
        //      if(nums[i]==nums[i+1]){
        //        temp=nums[i];
        //      }
        // }
        //     return temp;


        //Brute force Approach2:-
        // int temp=0;
        // for(int i = 0; i<nums.length; i++){
        //     for(int j = i+1; j<nums.length; j++){
        //         if(nums[i]==nums[j]){
        //           temp=nums[i];
        //         }
        //     }
        // }
        // return temp;


        //Better Approach:-
        // int temp=0;
        // HashMap<Integer , Integer> map = new HashMap<>();
        // for(int i = 0; i < nums.length; i++) {
        //     int num = nums[i];
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }
        // for(int key : map.keySet()){
        // if(map.get(key) > 1){
        //     temp=key;
        //     break;
        //     }
        // }
        //     return temp;


        // Optimal Approach:-
         int slow = nums[0];
         int fast = nums[0];
         do{
            slow=nums[slow];
            fast=nums[nums[fast]];
         }while (slow !=fast);

         slow = nums[0];

         while(slow !=fast){
           slow=nums[slow];
           fast=nums[fast];
         }
        return slow;
    }
}