class Solution {
    public boolean rotateString(String s, String goal) {
        // brute force
        // char[] ch = s.toCharArray();
        // if(s.length()!=goal.length()) return false;
        
        // for(int i=0 ; i<ch.length ; i++){
        //     if(new String(ch).equals(goal)) return true;
        //     char temp = ch[0];
            
        //     for(int j=0 ; j<ch.length-1 ; j++){
        //     ch[j]=ch[j+1];
        //     }
            
        //     ch[ch.length-1]=temp;
        // }
        //    return false;

        // better
        if(s.length()!=goal.length()) return false;
        if((s+s).contains(goal)) return true;
        return false;
    }
}