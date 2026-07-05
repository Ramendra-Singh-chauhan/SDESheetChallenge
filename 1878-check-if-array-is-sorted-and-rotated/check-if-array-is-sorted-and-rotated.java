class Solution {
    public boolean check(int[] nums) {
        int[] A = new int[nums.length];
        int x = 0;
        for(int i = 0 ;i<nums.length-1 ; i++){
           if(nums[i]>nums[i+1]){
            x=i+1;
           }
        }
        for(int i = 0 ; i<nums.length ; i++){
            A[i]=nums[(i+x) % nums.length];
        }
        Arrays.sort(nums);
        if(Arrays.equals(A,nums)) return true;
        return false;
    }
}