class Solution {
    public int maxDepth(String s) {
        int count=0;
        int maxi=0;
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch=='('){
                if(count==0){
                    count++;
                }
                else{
                    count++;
                }
            }
            else if(ch==')'){
                maxi=Math.max(count,maxi);
                count--;
            }
            else{
                continue;
            }
        }
        return maxi;
    }
}