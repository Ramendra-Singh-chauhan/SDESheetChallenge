class Solution {
    public void nextPermutation(int[] nums) {
        //1) find the pivot element
        int pivot = -1;
        int n = nums.length;
        for(int i = n-2 ; i>=0 ; i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
        // edge case
        if(pivot == -1){
            Arrays.sort(nums);
            return;
        } 

        //2) find rightmost element of array and swap with pivot element

        for(int i = n-1 ; i>pivot ; i--){
           if (nums[i]>nums[pivot]){
            // swap pivot and rightmost elem
            int temp = nums[i];
            nums[i] = nums[pivot];
            nums[pivot] = temp;
            break;
           } 
        }
        // reverse elem from Pivot+1 -> n-1
        int i = pivot+1;
        int j = n-1;
        while(i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}