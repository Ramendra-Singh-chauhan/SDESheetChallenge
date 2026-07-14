class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans ="";
        Arrays.sort(strs);

        //isse array ka 1st string and last string mill jayega
        char[] first=strs[0].toCharArray();
        char[] last=strs[strs.length-1].toCharArray();
      
        for(int i=0;i<first.length;i++){
            if(first[i] != last[i]){
                break;
            }
            ans = ans+(first[i]);
        }
        return ans;
    }
}