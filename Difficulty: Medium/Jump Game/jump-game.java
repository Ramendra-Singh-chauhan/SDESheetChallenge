class Solution {
    // Function to check if we can reach the last index from the 0th index.
    public boolean canReach(int[] arr) {
        int maxIndex = 0;
        for(int i = 0 ; i<arr.length ; i++){
            if(i>maxIndex) return false;
            maxIndex = Math.max(maxIndex , i+arr[i]);
        }
        return true;
    }
}