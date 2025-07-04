class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int res[]= new int [nums1.length];
       for(int i =0;i<nums1.length; i++)
       {
        int tar = nums1[i];
        int idx=0;
        for(int j=0;j<nums2.length;j++){
          if (tar==nums2[j]){
                idx=j;
                break;
          }
        }
        int max=-1;
        for(int k=idx+1;k<nums2.length;k++)
        {
            if(nums2[k]>tar)
            {
                max=nums2[k];
                break;
            }
        }
        res[i]=max;
       }  
       return res;
    }
}