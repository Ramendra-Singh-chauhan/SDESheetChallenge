class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount<1) return 0;

        int[] mincoinDp = new int [amount+1];
        for(int i = 1 ; i<=amount ; i++){
            mincoinDp[i] = Integer.MAX_VALUE;
            for(int coin : coins){
                if(coin <= i && mincoinDp[i - coin]!=Integer.MAX_VALUE){
                    mincoinDp[i]=Math.min(mincoinDp[i] , 1+mincoinDp[i-coin]);               }
            }
            // if(mincoinDp[amount] == Integer.MAX_VALUE) return -1;
        }
        if(mincoinDp[amount] == Integer.MAX_VALUE) return -1;
        return mincoinDp[amount];
    }
}