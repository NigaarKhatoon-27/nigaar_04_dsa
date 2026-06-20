class Solution {
    public void mergeSort(int[] nums , int left ,int right){
        if(left >= right) return;
        int mid = left + (right - left)/2;
        mergeSort(nums , left , mid);
        mergeSort(nums , mid+1 , right);
       merge(nums , left , mid , right);
       
    }
    public void merge(int[] arr , int low , int mid , int high){
        int left = low;
        int right = mid+1;
        int[] temp = new int[high-low+1];
        int k=0;
        while(left <= mid && right<=high){
            if(arr[left] < arr[right]){
                temp[k]=arr[left];
                k++;
                left++;
            }
            else{
                temp[k]= arr[right];
                k++;
                right++;
            }
            }
            while(left <= mid){
                temp[k] = arr[left];
                k++;
                left++;
            }
            while(right <= high){
                temp[k]=arr[right];
                k++;
                right++;
            }
              for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }

    }
    public int[] sortArray(int[] nums) {
        int left =0;
        int right = nums.length-1;
       mergeSort(nums , left , right);
       return nums;
        }
        }