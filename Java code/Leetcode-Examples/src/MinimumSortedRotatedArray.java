public class MinimumSortedRotatedArray {
    public int minimum(int[] arr){
        int n = arr.length;
        if (arr.length == 0) return -1;
        if (arr.length == 1) return arr[0];

        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int mid = left + (right-left)/2;
            if(mid > 0 && arr[mid] < arr[mid-1]){
                return arr[mid];
            }else if (arr[mid] > arr[left] && arr[mid] > arr[right]){
                left = mid +1;
            }else {
                right = mid -1;
            }
        }
        return arr[left];
    }
}
