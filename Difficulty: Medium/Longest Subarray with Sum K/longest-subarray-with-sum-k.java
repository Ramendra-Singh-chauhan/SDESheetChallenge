// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // Brute force Approach:-
        
        // int length = 0;
        // for(int i = 0 ; i<arr.length ; i++){
        //     int sum = 0;
        //     for(int j = i ; j<arr.length ; j++){
        //         sum=sum+arr[j];
        //         if(sum==k) length = Math.max(length,j-i+1);
        //     }
        // }
        // return length;
        
        // optimal Aprroach:-
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                maxLen = i + 1;
            }
            int rem = sum - k;
            if (map.containsKey(rem)) {
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLen;

    }
}
