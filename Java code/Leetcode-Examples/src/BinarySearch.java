public class BinarySearch {
    public boolean Search(int[] list, int target){
        int low = 0;
        int high = list.length;
        while (low <= high){
            int mid = (int)Math.floor((low + high) / 2);
            if (list[mid] == target){
                return true;
            }else if (list[mid] < target){
                low = mid +1;
            }else {
                high = mid -1;
            }
        }
        return false;
    }
}
