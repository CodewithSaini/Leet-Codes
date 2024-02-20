public class QuickSort {
    public void quicksort(int[] arr){
        quicksort(arr, 0, arr.length -1);
    }
    private void quicksort(int[] arr, int low, int high){
        if (low >= high){
            return;
        }
        int pivotIndex = partition(arr, low, high);
        quicksort(arr, low, pivotIndex-1);
        quicksort(arr, pivotIndex+1, high);

    }
    private int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int leftPointer = low;
        int rightPointer = high;
        while(leftPointer < rightPointer){
            while(arr[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while(arr[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            swap(arr, leftPointer, rightPointer);
        }
        swap(arr, leftPointer, high);
        return leftPointer;
    }
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
