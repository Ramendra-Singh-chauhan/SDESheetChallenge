class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();


        // brute force 
        // String[] brr = new String[arr.length];
        // int left = 0;
        // int right = arr.length-1;
        // while(right>=0){
        //     brr[left]=arr[right];
        //     left++;
        //     right--;
        // }
        // return String.join(" ",brr);

        // better Approach
        for(int i = arr.length-1 ; i>=0 ; i--){
            if(arr[i].length()>0){
                sb.append(arr[i]);
                sb.append(" ");
            }
        }
        return sb.substring(0, sb.length() - 1).toString();
    }
}