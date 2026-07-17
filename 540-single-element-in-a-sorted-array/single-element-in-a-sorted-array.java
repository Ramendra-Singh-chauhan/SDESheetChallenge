class Solution {
    public int singleNonDuplicate(int[] nums) {
        // brute force
        // int single=0;
        // for(int i=0 ; i<nums.length ; i++){
        //     single=single^nums[i];
        // }
        // return single;

        // better

        // HashMap<Integer , Integer> map = new HashMap<>();
        // for(int i=0 ; i<nums.length ; i++){
        //     map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
        // }
        // for(int key : map.keySet()){
        //     if(map.get(key)==1){
        //         return key;
        //     }
        // }
        // return -1;

        // optimal

        int n=nums.length;
        if(nums.length==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];
        int low=1;
        int high=n-2;
        
        while(low<=high){
            int mid=(low+high)/2;

            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) return nums[mid];

            if(mid%2==1 && nums[mid]==nums[mid-1] ||mid%2==0 && nums[mid]==nums[mid+1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}