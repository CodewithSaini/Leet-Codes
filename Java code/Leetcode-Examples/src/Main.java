
public class Main {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int[] arr2 = {1,1};
        BestTimeBuySellStock sol2 = new BestTimeBuySellStock();
        int result = sol2.maxProfit(arr);
        ModifiedBinarySearch search = new ModifiedBinarySearch();
        int index = search.search(arr, 0, 0, 6);
        System.out.println(index);
    }
}

