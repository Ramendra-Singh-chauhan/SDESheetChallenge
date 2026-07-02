class Solution {
    void findcombination(int index , int target, int [] candidates , List<List<Integer>> ans , List<Integer> curr){
        if(index == candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(curr));
            }
            return;
        }
        if(candidates[index]<=target){
            curr.add(candidates[index]);
            findcombination(index , target-candidates[index] , candidates , ans , curr);
            curr.remove(curr.size()-1);
        }
            findcombination(index + 1  , target , candidates , ans , curr);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        findcombination(0 , target , candidates , ans , curr);
        return ans;
        
    }
}