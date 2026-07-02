class Solution {
    void permutation(int[] nums , int index ,List<List<Integer>> ans ){
        if(index==nums.length){
            // ans.add(new ArrayList<>(curr));
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) {
                temp.add(num);
            }
            ans.add(temp);
            return;
        }
        for(int i = index ; i<nums.length ; i++){
            swap(nums , index , i);
            permutation(nums , index+1 , ans);
            swap(nums , index , i);
        }
    }
    void swap(int [] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permutation(nums , 0 , ans );
        return ans;
    }
}