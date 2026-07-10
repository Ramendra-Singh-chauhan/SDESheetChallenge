class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        // brute force
        
        // int lastelement = arr[arr.length-1];
        // for(int i=0 ; i<arr.length-1 ; i++){
        //     boolean leader = true;
        //     for(int j=i+1 ; j<arr.length ; j++){
        //         if(arr[i]<arr[j]){
        //             leader = false;
        //             break;
        //         }
        //     }
        //     if(leader==true) ans.add(arr[i]);
        // }
        // ans.add(lastelement);
        // return ans;
        
        // better 
        
        int max = Integer.MIN_VALUE;

for (int i = n - 1; i >= 0; i--) {
    if (arr[i] >= max) {
        ans.add(arr[i]);
        max = arr[i];
    }
}

Collections.reverse(ans);
return ans;
    }
}
