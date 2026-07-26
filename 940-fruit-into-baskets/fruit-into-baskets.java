class Solution {
    public int totalFruit(int[] fruits) {
        // brute force
        // int maxlength=0;
        // for(int i=0 ; i<fruits.length ; i++){
        //     HashSet<Integer> set = new HashSet<>();
        //     for(int j=i ; j<fruits.length ; j++){
        //         set.add(fruits[j]);
        //         if(set.size()<=2){
        //             maxlength=Math.max(maxlength,j-i+1);
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        // return maxlength; 

        // better approach
        
        Map<Integer, Integer> basket = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxFruits = 0;

        while (right < fruits.length) {
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);

            while (basket.size() > 2) {
                basket.put(fruits[left], basket.get(fruits[left]) - 1);

                if (basket.get(fruits[left]) == 0) {
                    basket.remove(fruits[left]);
                }
                left++;
            }
            maxFruits = Math.max(maxFruits, right - left + 1);
            right++;
        }

        return maxFruits;
    }
}