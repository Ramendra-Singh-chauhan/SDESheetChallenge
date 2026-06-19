class Solution {
    static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        int time = 0;
        int waitetime = 0;
        for(int i = 0 ; i<bt.length ; i++){
            waitetime+=time;
            time+=bt[i];
        }
        return waitetime/bt.length;
    }
}
