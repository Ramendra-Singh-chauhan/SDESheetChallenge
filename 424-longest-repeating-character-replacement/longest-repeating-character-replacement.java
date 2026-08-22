class Solution {
    public int characterReplacement(String s, int k) {
        int maxlength=0 , l=0 , r=0 , maxfreq=0;
        int freq[] = new int[26];
        for(r=0 ; r<s.length() ; r++){
            freq[s.charAt(r)-'A']++;
            maxfreq=Math.max(maxfreq , freq[s.charAt(r)-'A']);

            int windowSize = r-l+1;

            if(windowSize - maxfreq >k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            
            windowSize = r-l+1;
            maxlength=Math.max(maxlength , windowSize);
        }
        return maxlength;
    }
}