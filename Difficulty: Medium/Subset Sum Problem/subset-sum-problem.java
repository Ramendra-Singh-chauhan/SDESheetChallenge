class Solution {
    static boolean findcombination(int index , int sum , int[] arr){
        if(sum==0){
            return true;
        }
        if(index == arr.length){
            return false;
        }
        
        if(arr[index]<=sum){
           if (findcombination(index+1 , sum-arr[index] , arr)){
               return true;
           }
        }
        return findcombination(index+1 , sum , arr);
    }

    public boolean isSubsetSum(int arr[], int sum) {
        return findcombination(0 , sum , arr);
    }
}