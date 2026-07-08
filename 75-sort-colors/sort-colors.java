class Solution {
    public void sortColors(int[] nums) {
        // brute force :-
        // for(int i=0 ; i<nums.length ; i++){
        //     for(int j=i; j<nums.length ; j++){
        //         if(nums[i]>nums[j]){ 
        //             int temp = nums[i];
        //             nums[i]=nums[j];
        //             nums[j]=temp;
        //         }
        //     }
        // }

        // better approach
        // int zero=0 , one=0 , two=0;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]==0) zero++;
        //     else if(nums[i]==1) one++;
        //     else two++;
        // }
        // for(int i=0; i<zero; i++) nums[i]=0;
        // for(int i=zero; i<(zero+one); i++) nums[i]=1; 
        // for(int i=zero+one; i<nums.length; i++) nums[i]=2;



        // optimal approach
        int low=0 , mid=0 , high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}