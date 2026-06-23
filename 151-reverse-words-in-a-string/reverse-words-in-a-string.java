class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(int i = arr.length-1 ; i>=0 ; i--){
            if(arr[i].length()>0){
                sb.append(arr[i]);
                sb.append(" ");
            }
        }
        return sb.substring(0, sb.length() - 1).toString();
    }
}