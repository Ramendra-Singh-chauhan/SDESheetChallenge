class Solution {
    public void moveZeroes(int[] nums) {
        // Brute force Approach
        // int[] temp = new int[nums.length];
        // int index=0;
        // for(int i = 0 ; i<nums.length ; i++){
        //     if(nums[i]!=0){
        //         temp[index]=nums[i];
        //         index++;
        //     }
        // }
        // for(int i = 0 ; i<temp.length ; i++){
        //     nums[i]=temp[i];
        // }
        // for(int i = index ; i<nums.length ; i++){
        //     nums[i]=0;
        // }  
        int j = -1;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return;
        for(int i = j+1 ; i<nums.length ; i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}