class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) return true;

        int len = flowerbed.length;
        
        // handle single elem 
        if(len==1){
            if(flowerbed[0]==0 && n==1)
                return true;
                return false;
            
        }

        // first index handle
        if(flowerbed[0]==0 && flowerbed[1]==0){
                    flowerbed[0]=1;
                    n--;
            }

        // hondle middle elem 
        for(int i=1 ; i<flowerbed.length-1 ; i++){
              if(flowerbed[i]==0 && flowerbed[i+1]==0 && flowerbed[i-1]==0){
                flowerbed[i]=1;
                n--;
              }
        }
        // handle last index
        if(flowerbed[len-1]==0 && flowerbed[len-2]==0){
                    flowerbed[len-1]=1;
                    n--;
        }
        return n<=0;
    }
}