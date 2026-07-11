class Solution {
    public int findContentChildren(int[] g, int[] s) {
      Arrays.sort(g);
      Arrays.sort(s);
      int n = g.length , right=0;
      int m = s.length , left=0;
      while(left<m && right<n){
        if(g[right]<=s[left]){
            right++;
        }
        left++;
      }
      return right;
    }
}