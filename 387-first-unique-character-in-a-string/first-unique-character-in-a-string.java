class Solution {
    public int firstUniqChar(String s) {
        // brute force
        // for(int i=0 ;i<s.length() ;i++){
        //     int count=0;
        //     for(int j=0 ;j<s.length() ;j++){
        //         if(s.charAt(i)==s.charAt(j)){
        //             count++;
        //         }
        //     }
        //     if(count==1){
        //         return i;
        //     }
        // }
        // return -1;

        // optimal
        HashMap<Character , Integer> map = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);

            if(!map.containsKey(ch)){
                q.offer(i);
            }
            map.put(ch ,map.getOrDefault(ch,0)+1);
        }
        while(!q.isEmpty() && map.get(s.charAt(q.peek()))>1){
            q.poll();
        }
        return q.isEmpty() ? -1 : q.peek();
    }
}