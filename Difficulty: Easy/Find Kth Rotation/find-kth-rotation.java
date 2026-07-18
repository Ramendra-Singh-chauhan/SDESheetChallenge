class Solution {
    int findK(int[] arr){
        int ans=0;
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]>=arr[i-1]){
                continue;
            }
            else{
                ans=i;
            }
        }
        return ans;
    }
    public int findKRotation(int arr[]) {
        // Code here
        int ans=findK(arr);
        return ans;
    }
}