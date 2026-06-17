class Solution {
    //optimal Approach using Merge Sort:-
        int count = 0;
        void merge(int [] arr , int low , int mid , int high){
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid+1;
        int index = 0;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[index++]=arr[left];
                left++;
            }
            else{
                temp[index++]=arr[right];
                count+=(mid-left+1);
                right++;
            }
        }
        while(left<=mid){
            temp[index++]=arr[left];
            left++;
        }
        while(right<=high){
            temp[index++]=arr[right];
            right++;
        }
        for(int i = low ; i<=high ; i++){
            arr[i]=temp[i-low];
        }
    }
    void Ms(int []arr , int low , int high){
        if(low >= high) return;
        int mid = (low+high)/2;
        Ms(arr , low , mid);
        Ms(arr , mid+1 , high);
        merge(arr , low , mid , high);
    }
     int inversionCount(int arr[]) {
        
        Ms(arr,0,arr.length-1);
        return count;
        
        // Brute Force Approach:-
        
        // int count = 0;
        // for(int  i = 0 ; i<arr.length - 1 ; i++){
        //     for(int j = i+1 ; j<arr.length ; j++){
        //         if(arr[i]>arr[j]) count+=1;
        //     }
        // }
        // return count;
        
        
        
        
    }
}