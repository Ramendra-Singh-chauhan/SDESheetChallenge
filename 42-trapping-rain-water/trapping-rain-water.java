class Solution {
    

    public int trap(int[] height) {
        int n = height.length;
        // Brute Force Approach:-
        int totalwater = 0;
        // for(int i = 0 ; i<n ; i++){
        //     int rightmax = 0;
        //     int leftmax = 0;

        //     // find max value in left side
        //     for(int j = 0 ; j<=i ; j++){
        //         if(height[j]>leftmax){
        //         leftmax=height[j];
        //         }
        //     }


        //     //  find max value in right side
        //     for(int j = i ; j<n ; j++){
        //         if(height[j]>rightmax){
        //         rightmax=height[j];
        //         }
        //     }

        //     totalwater += Math.min(leftmax,rightmax) - height[i];
        // }
        // return totalwater;

        // better Approach
         int prefixmax [] = new int [n];
         int suffixmax [] = new int [n];
         
         prefixmax[0] = height[0];
         for(int i = 1 ; i<n ;i++){
            prefixmax[i] = Math.max(prefixmax[i-1], height[i]);
         }

         suffixmax[n-1] = height[n-1];
         for(int i = n-2 ; i>=0 ;i--){
            suffixmax[i] = Math.max(suffixmax[i+1], height[i]);
         }

         for(int i = 0 ; i<n ; i++){
            if(height[i]<prefixmax[i] && height[i]<suffixmax[i]){
                totalwater += Math.min(prefixmax[i] , suffixmax[i]) - height[i]; 
            }
         }
        return totalwater;
    }
}