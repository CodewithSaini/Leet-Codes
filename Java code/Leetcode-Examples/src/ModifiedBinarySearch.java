public class ModifiedBinarySearch {
    public int search(int[] arr, int target, int left, int right){
        if (left > right){
            return -1;
        }
        int mid = (int)left + ((right-left)/2);
        if (arr[mid] == target){
            return mid;
        }
        if (arr[mid] >= arr[left]){
            if((arr[left] <= target) && (target <= arr[mid])){
                return search(arr, target, left, mid-1);
            }else{
                return search(arr, target, mid+1, right);
            }
        }else{
            if ((arr[mid] <= target) && (target <= arr[right])){
                return search(arr, target, mid+1, right);
            }else {
                return search(arr, target, left, mid-1);
            }
        }
    }
}
