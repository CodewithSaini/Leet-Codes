
public class Main {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4, 0};
        BestTimeBuySellStock sol = new BestTimeBuySellStock();
        int result = sol.maxProfit(arr);
        BinarySearch search = new BinarySearch();
        Merge_Sort sort = new Merge_Sort();
        boolean isExist = search.Search(arr, 1);
        System.out.println(isExist);
        sort.Sort(arr);
        for (int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

