public class Merge_Sort {
    public void Sort(int[] arr){
        int n = arr.length;
        if (n < 2){
            return;
        }
        int mid = (int) n/2;
        //System.out.println(mid);
        int[] left = new int[mid];
        int[] right = new int[n-mid];
        for (int i=0; i<mid; i++){
            left[i] = arr[i];
            //System.out.println("Left: " + left[i]);
        }
        for (int j=mid; j<n; j++){
            right[j-mid] = arr[j];
            //System.out.println("Right: " + right[j-mid]);
        }
        System.out.println("\n");
        Sort(left);
        Sort(right);
        Merge(arr, left, right, mid, n-mid);
    }
    public void Merge(int[] arr, int[] l, int[] r, int leftIndex, int rightIndex ){
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftIndex && j < rightIndex){
            if (l[i] <= r[j]){
                arr[k] = l[i];
                i++;

            }
            else {
                arr[k] = r[j];
                j++;
            }
            k++;
        }
        while (i < leftIndex){
            arr[k] = l[i];
            i++;
            k++;
        }
        while (j < rightIndex){
            arr[k] = r[j];
            j++;
            k++;
        }
    }
}
