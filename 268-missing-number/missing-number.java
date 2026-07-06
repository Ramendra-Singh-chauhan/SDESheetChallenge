class Solution {
    public int missingNumber(int[] nums) {
        // brute force 

        // for(int i  = 0 ; i<= nums.length ; i++){
        //     boolean found = false;
        //     for(int j = 0 ; j<nums.length ; j++){
        //         if(nums[j]==i){
        //             found = true;
        //             break;
        //         }
        //     }
        //     if(!found) return i;
        // }
        // return -1;

        // better Approach
        int n = nums.length;
        int[] hash = new int[n+1];
        Arrays.fill(hash,0);
        for(int i = 0 ; i< n ; i++){
            hash[nums[i]]++;
        }
        for(int i = 0 ; i<hash.length ; i++){
            if(hash[i]==0){
                return i;
            }
        }
        return -1;
    }
}