class Solution {
    public long subarrayXor(int arr[], int k) {
    //   Brute Force Appproach:-
    
    //   int count = 0;
    //   for(int i = 0 ; i<arr.length ; i++){
    //       int xor = 0;
    //       for(int j = i ; j<arr.length ; j++){
    //           xor=xor^arr[j];
    //           if(xor==k) count++;
    //       }
    //   }
    //     return count;
    
    
    // optimal Approach:-
    
    Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefixXor = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];  
            prefixXor ^= num;
            int target = prefixXor ^ k;
    
            if (map.containsKey(target)) {
            count += map.get(target);
            }
            map.put(prefixXor, map.getOrDefault(prefixXor, 0) + 1);
            }
            return count;
        }
    }
