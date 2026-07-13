class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        // using count approach

        int count=0;
        for(int i=0 ; i<s.length() ;i++){
            char ch = s.charAt(i);
            if(ch=='('){
                if(count==0){
                    count++;
                }
                else{
                    ans.append(ch);
                    count++;
                }
            }
            else{
                count--;
                if(count!=0){
                    ans.append(ch);
                }
                // else{
                //     ans.append(ch);
                // }
            }
        }
        return ans.toString();

        // using stack Approach

        // Stack<Character> st = new Stack<>();
        // for(int i=0 ; i<s.length() ;i++){
        //     char ch = s.charAt(i);

        //     if(ch=='('){
        //         if(st.isEmpty()){
        //             st.push(ch);
        //         }
        //         else{
        //             ans.append(ch);
        //             st.push(ch);
        //         }
        //     }
        //     else{
        //         st.pop();
        //         if(!st.isEmpty()){
        //             ans.append(ch);
        //         }
        //     }
        // }
        // return ans.toString();
    }
}
