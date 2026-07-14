class Solution {
    public String longestCommonPrefix(String[] strs) {
        // brute force
        String first = strs[0];
        for(int i=0 ; i<first.length() ; i++){
            char ch = first.charAt(i);

            for(int j=1 ; j<strs.length ; j++){
                if(i==strs[j].length() || strs[j].charAt(i)!=ch){
                    return first.substring(0,i);
                }
            }
        }
        return first;

        // better approach
        // String ans ="";
        // Arrays.sort(strs);

        // //isse array ka 1st string and last string mill jayega
        // char[] first=strs[0].toCharArray();
        // char[] last=strs[strs.length-1].toCharArray();
      
        // for(int i=0;i<first.length;i++){
        //     if(first[i] != last[i]){
        //         break;
        //     }
        //     ans = ans+(first[i]);
        // }
        // return ans;
    }
}