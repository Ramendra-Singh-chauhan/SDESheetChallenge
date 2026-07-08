class Solution {
    public int majorityElement(int[] nums) {
        // BruteForce Approach:-
        // int maxCount = 0;
        // int ans = 0;
        // for(int i = 0 ; i<nums.length ; i++){
        //     int count = 0;
        //     for(int j = i ; j<nums.length ; j++){
        //        if(nums[i]==nums[j]) count++;
        //     }   
        //     if(count>(nums.length/2)) {
        //         ans=nums[i];
        //         return ans;     
        //     }
        // }
        // return ans;

        // Better Approach:-

        //  int temp = 0;
        //  HashMap <Integer,Integer> map = new HashMap<>();
        //  for(int i =0;i<nums.length ; i++){
        //     int num = nums[i];
        //     map.put(num,map.getOrDefault(num,0)+1);
        //  }
        //  int element = -1;
        //  for(int key:map.keySet()){
        //     if(map.get(key) > nums.length/2) {
        //        element = key;
        //      }
        //  }
        //  return element;

        // Optimal approach(moore voating algo)

        int count = 0;
        int element = 0;
        for(int i = 0 ; i<nums.length ; i++){
            if(count==0){
                element=nums[i];
            }
            if(element==nums[i]) count++;
            else{
                count--;
            }
        }
        int count1 = 0;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]==element) count1++;
        }
        if(count1>(nums.length)/2){
            return element;
        }
        return -1;
    }
}