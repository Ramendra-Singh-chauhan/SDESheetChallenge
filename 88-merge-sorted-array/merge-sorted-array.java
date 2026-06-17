class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //  int right = m-1;
        //  int left = 0;
        //  while(right>=0 && left<n){
        //     if(nums1[right]>nums2[left]){
        //         int temp=nums1[right];
        //         nums1[right]=nums2[left];
        //         nums2[left]=temp;
        //         right--;
        //         left++;
        //     }
        //     else{
        //         break;
        //     }
        //  }
        //  Arrays.sort(nums1, 0, m);
        //  Arrays.sort(nums2, 0, n);
         for(int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);

        }
    }
