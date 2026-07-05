class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        int m = a.length;
        int n = b.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int left = 0;
        int right = 0;
        while(left<m && right<n){
            if(a[left]<b[right]){
                if(ans.isEmpty() || ans.get(ans.size()-1)!=a[left]){
                    ans.add(a[left]);
                }
                left++;
            }
            else if(a[left]>b[right]){
                if(ans.isEmpty() || ans.get(ans.size()-1)!=b[right]){
                    ans.add(b[right]);
                }
                right++;
            }
            else{
                if(ans.isEmpty() || ans.get(ans.size()-1)!=b[right]){
                    ans.add(b[right]);
                }
                right++;
                left++;
            }
        }
        while(left<m){
            if(ans.isEmpty() || ans.get(ans.size()-1)!=a[left]){
                ans.add(a[left]);
            }
            left++;
        }
        while(right<n){
            if(ans.isEmpty() || ans.get(ans.size()-1)!=b[right]){
                ans.add(b[right]);
            }
            right++;
        }
        return ans;
    }
}
