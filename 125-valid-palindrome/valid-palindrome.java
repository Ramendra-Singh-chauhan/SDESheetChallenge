class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        char[] arr = sb.toString().toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]==arr[right]){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}