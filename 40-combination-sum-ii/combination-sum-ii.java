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
            findcombination(index + 1 , target-candidates[index] , candidates , ans , curr);
            curr.remove(curr.size()-1);
        }
        int idx = index+1;
        while(idx<candidates.length && candidates[idx]==candidates[idx-1]){
            idx++;
        }
       
            findcombination(idx  , target , candidates , ans , curr);

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        findcombination(0 , target , candidates , ans , curr);
        return ans;
    }
}