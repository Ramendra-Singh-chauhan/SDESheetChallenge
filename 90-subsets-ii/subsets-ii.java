class Solution {
     void recrr(int [] nums, int index , List<Integer> curr, ArrayList<List<Integer>> ans){
        if(index==nums.length) {
            ans.add(new ArrayList(curr));
            return;
        }

        curr.add(nums[index]);
        recrr(nums,index+1,curr,ans);
        curr.remove(curr.size()-1);
        int idx = index+1;
        while(idx<nums.length && nums[idx]==nums[idx-1]){
            idx++;
        }
        recrr(nums,idx,curr,ans);

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> ans =  new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        recrr(nums,0,curr,ans);
        return ans;
    }
}
