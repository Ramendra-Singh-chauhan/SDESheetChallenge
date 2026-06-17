class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    //   Brute force Approach:-
    //   Set<List<Integer>> set = new HashSet<>();
    //   for(int i = 0 ; i<nums.length-2; i++){
    //     for(int j = i+1 ; j<nums.length-1; j++){
    //         for(int k = j+1 ; k<nums.length ; k++){
    //             if(nums[i] + nums[j] + nums[k] == 0){
    //             List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
    //             Collections.sort(temp);
    //             set.add(temp);
    //             }
    //         }
    //     }
    //   }
    //     List<List<Integer>> ans = new ArrayList<>(set);
    //     return ans;  


    // Better Approach:-
        Set<List<Integer>> ans = new HashSet<>();
        for(int i = 0 ; i<nums.length ; i++){
            Set<Integer> hashset = new HashSet<>();
            for(int j = i+1 ; j<nums.length ; j++){
                int third = -(nums[i]+nums[j]);
                if(hashset.contains(third)){
                     List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                     Collections.sort(temp);
                     ans.add(temp);
                }
                hashset.add(nums[j]);
            }
        }
    return new ArrayList<>(ans);
    }
}