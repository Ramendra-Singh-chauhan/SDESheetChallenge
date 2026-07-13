class Solution {
    public boolean isAnagram(String s, String t) {
        // brute force
        // char[] arr1 = s.toCharArray();
        // char[] arr2 = t.toCharArray();
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // if(Arrays.equals(arr1 , arr2)) return true;
        // return false;

        // optimal

        s=s.toLowerCase();
        t=t.toLowerCase();

        s=s.replace(" " , "");
        t=t.replace(" " , "");

        int[] count = new int[26];

        for(int i=0 ; i<s.length() ; i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i=0 ; i<t.length() ; i++){
            count[t.charAt(i)-'a']--;
        }

        for(int coun:count){
            if(coun!=0) return false;
        }
        return true;
    }
}