class Solution {
    public static boolean isPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;

    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }

    return true;
}
    void getallpair(String s , List<String> subpart , List<List<String>> ans){
        if(s.length()==0){
            ans.add(new ArrayList(subpart));
            return;
        }
        for(int i = 0 ; i<s.length() ; i++){
            String part = s.substring(0 , i+1);
            if(isPalindrome(part)){
                subpart.add(part);
                getallpair(s.substring(i+1) , subpart , ans);
                subpart.remove(subpart.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> subpart = new ArrayList<>();
        getallpair(s , subpart , ans);
        return ans;
    }
}