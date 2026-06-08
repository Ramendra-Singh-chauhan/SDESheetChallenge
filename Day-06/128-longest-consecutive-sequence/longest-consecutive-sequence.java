class Solution {
    // boolean Linearsearch (int[] arr , int num){
    //     for(int i = 0 ; i<arr.length ; i++){
    //         if(arr[i]==num) return true;
    //     }
    //     return false;
    // }
    public int longestConsecutive(int[] nums) {
        // Brute force Approach:-
        
        // if(nums.length==0) return 0;
        // int longest = 0;
        // for(int i = 0; i<nums.length ; i++){
        //     int x = nums[i];
        //     int count = 1;
        //     while(Linearsearch (nums,x+1) == true){
        //     x=x+1;
        //     count = count+1;
        //     }
        //     longest=Math.max(longest,count);
        // }      
        // return longest;

        // Better Approach:-

        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int n = nums.length;
        int longest = 1;
        int count  = 0;
        int lastsmall = Integer.MIN_VALUE;
        for(int i = 0 ; i<n ; i++){
            if((nums[i]-1)==lastsmall){
                count = count + 1;
                lastsmall=nums[i];
            }
            else if(nums[i]!=lastsmall){
                count=1;
                lastsmall=nums[i];
            }
            longest = Math.max(longest,count);
        }
        return longest;
}
}