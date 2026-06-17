class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // //bruteforce Approach:-
        
        // int missing  = -1;
        // int duplicate = -1;
        // for(int i = 1 ; i<=arr.length ; i++){
        //     int count = 0;
        //     for(int j = 0; j<arr.length ; j++){
        //         if(arr[j]==i) count++;
        //     }
        //     if(count==2) duplicate=i;
        //     else if(count==0) missing=i;
        //     if(missing!=-1  && duplicate!=-1){
        //     break;
        // }
        // }
        // ArrayList<Integer> ans = new ArrayList<>();
        // ans.add(duplicate);
        // ans.add(missing);
        // return ans;
        
        
        //Better Approach:-
        
        // int n = arr.length;
        // int[] hash = new int[n + 1];
        // for(int i = 0; i < n; i++) {
        //     hash[arr[i]]++;
        // }
        // int missing = -1;
        // int duplicate = -1;
        // for(int i = 1; i <= n; i++) {
        //     if(hash[i] == 2) {
        //         duplicate = i;
        //     }
        //     if(hash[i] == 0) {
        //         missing = i;
        //     }
        //     if(missing != -1 && duplicate != -1) {
        //         break;
        //     }
        // }
        // ArrayList<Integer> ans = new ArrayList<>();
        // ans.add(duplicate);
        // ans.add(missing);
        // return ans;
        
        
        //optimal approach:-
        
        //s-sn = x-y
        //s2-s2n = x2-y2
        long n = arr.length;
        long sn = (n*(n+1))/2;
        long s2n = (n*(n+1)*(2*n+1))/6;
        
        long s = 0, s2 = 0;
        for(int i = 0 ; i<arr.length ; i++){
            s+=(arr[i]);
            s2+=(long)arr[i]*arr[i];
        }
        long val1=s-sn;   //x-y
        long val2=s2-s2n;
        val2=val2/val1;  //x+y
        long x =(val1 + val2)/2;
        long y = x-val1;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add((int)x);
        ans.add((int)y);
        return ans;

    }
}
