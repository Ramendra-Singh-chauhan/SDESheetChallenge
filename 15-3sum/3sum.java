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
        // Set<List<Integer>> set = new HashSet<>();
        // for(int i = 0 ; i<nums.length ; i++){
        //     Set<Integer> hashset = new HashSet<>();
        //     for(int j = i+1 ; j<nums.length ; j++){
        //         int third = -(nums[i]+nums[j]);
        //         if(hashset.contains(third)){
        //              List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
        //              Collections.sort(temp);
        //              set.add(temp);
        //         }
        //         hashset.add(nums[j]);
        //     }
        // }
        // List<List<Integer>> ans = new ArrayList<>(set);
        // return ans;

        // Optimal Approach:-
        Arrays.sort(nums);
        ArrayList<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for(int i = 0 ; i<n ; i++){
            if(nums[i] > 0) break;
            if(i > 0 && nums[i]==nums[i-1]) continue;
            int left = i+1 , right = n-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum==0){
                ans.add(Arrays.asList(nums[i] , nums[left] , nums[right]));
                left++;
                right--;
                // Skip duplicates for left
                while (left < right && nums[left] == nums[left - 1]) left++;
                // Skip duplicates for right
                while (left < right && nums[right] == nums [right + 1]) right--;
                }
                else if (sum < 0) left++;
                else right--;
            }
        }
        return ans;
    }
}