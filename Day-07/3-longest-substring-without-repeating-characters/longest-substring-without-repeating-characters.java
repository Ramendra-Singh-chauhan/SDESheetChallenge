class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlength = 0;
        for(int i = 0 ; i<s.length() ; i++){
            int[] hashArray = new int[256];
            Arrays.fill(hashArray, 0);
            for(int j = i ; j<s.length() ; j++){
                if(hashArray[s.charAt(j)]==1) break;
                hashArray[s.charAt(j)] = 1;
                int length = j-i+1;
                maxlength = Math.max(maxlength , length);
            }
        }
        return maxlength;
    }
}