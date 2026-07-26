class Solution {
    public int totalFruit(int[] fruits) {
        // brute force
        // int maxlength=0;
        // for(int i=0 ; i<fruits.length ; i++){
        //     HashSet<Integer> set = new HashSet<>();
        //     for(int j=i ; j<fruits.length ; j++){
        //         set.add(fruits[j]);
        //         if(set.size()<=2){
        //             maxlength=Math.max(maxlength , j-i+1);
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        // return maxlength;
       
        // better approach
        int maxlength=0;
        int right=0;
        int left=0;
        HashMap<Integer , Integer> map = new HashMap<>();
        while(right<fruits.length){
            map.put(fruits[right] , map.getOrDefault(fruits[right],0)+1);
            while(map.size()>2){
                map.put(fruits[left] , map.getOrDefault(fruits[left],0)-1);
                if(map.get(fruits[left])==0){
                    map.remove(fruits[left]);
                }
                left++;
            }
            maxlength=Math.max(maxlength , right-left+1);
            right++;
        }
        return maxlength;
    }
}