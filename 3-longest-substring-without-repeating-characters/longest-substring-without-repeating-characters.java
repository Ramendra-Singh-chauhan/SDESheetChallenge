class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Brute Force Approach:-
        
        // int maxlength = 0;
        // for(int i = 0 ; i<s.length() ; i++){
        //     int[] hashArray = new int[256];
        //     Arrays.fill(hashArray, 0);
        //     for(int j = i ; j<s.length() ; j++){
        //         if(hashArray[s.charAt(j)]==1) break;
        //         hashArray[s.charAt(j)] = 1;
        //         int length = j-i+1;
        //         maxlength = Math.max(maxlength , length);
        //     }
        // }
        // return maxlength;


        // Optimal Approach:-

        int n = s.length();
        int HashLen = 256;
        int[] hash = new int[HashLen];
        Arrays.fill(hash, -1);
        int l = 0, r = 0, maxLen = 0;
        while (r < n) {
            if (hash[s.charAt(r)] >= l) {
                l = Math.max(hash[s.charAt(r)] + 1, l);
            }
            int len = r - l + 1;
            maxLen = Math.max(len, maxLen);
            hash[s.charAt(r)] = r;
            r++;
        }
        return maxLen;
    }
}