class Solution {
    void recrr(int [] nums, int index , List<Integer> curr, ArrayList<List<Integer>> ans){
        if(index==nums.length) {
            ans.add(new ArrayList(curr));
            return;
        }

        curr.add(nums[index]);
        recrr(nums,index+1,curr,ans);
        curr.remove(curr.size()-1);
        recrr(nums,index+1,curr,ans);

    }
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> ans =  new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        recrr(nums,0,curr,ans);
        return ans;
    }
}