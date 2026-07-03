class Solution {
    void MakeArrangement(char[] arr , int index , List<String> ans){
        if(index==arr.length){
            ans.add(new String(arr));
            return;
        }
        // char[] arr = s.toCharArray();
        for(int i = index ; i<arr.length ; i++){
            swap(arr , index , i);
            MakeArrangement(arr , index+1 , ans);
            swap(arr , index , i);
        }
        String str = new String(arr);
    }
    public void swap(char[] arr , int i , int j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    public String getPermutation(int n, int k) {
        List<String> ans = new ArrayList<>();
        char[] arr = new char[n];
        for(int i = 0 ; i<n ; i++){
            arr[i]=(char)('1'+i);
        }
        MakeArrangement(arr , 0 , ans);
        Collections.sort(ans);
        return ans.get(k-1);
    }
}