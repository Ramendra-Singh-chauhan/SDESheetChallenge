class Solution {
    int maxLength(int arr[]) {
        // code here
        int n = arr.length;
        int maxlength = 0;
        int sum = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0 ; i<n ; i++){
            sum+=arr[i];
            
            if(sum==0) maxlength = i+1;
            
            else if(map.containsKey(sum)){
                maxlength = Math.max(maxlength , i-map.get(sum));
            }
            else{
                map.put(sum , i);
            }
        }
        return maxlength;
    }
}