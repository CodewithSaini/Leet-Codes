
public class Main {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println("Hello world!");
        BestTimeBuySellStock sol = new BestTimeBuySellStock();
        int result = sol.maxProfit(arr);
        System.out.println(result);
    }
}
