public class StockBuyAndSell {

    public static void main(String[] args) {

        int[] arr = {100, 180, 260, 310, 40, 535, 695};
        daysWithProfit(arr);

        arr = new int[] {100, 50, 30, 20};
        daysWithProfit(arr);

        arr = new int[] {23, 13, 25, 29, 33, 19, 34, 45, 65, 67};
        daysWithProfit(arr);
    }

    private static void daysWithProfit(int[] arr) {

        int profit = 0;
        int startDay = 0;
        int endDay = -1;
        int buyValue = -1;

        buyValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (buyValue < arr[i] && (profit < arr[i] - buyValue)) {
                profit = arr[i] - buyValue;
            } else {
                buyValue = arr[i];
                if (endDay > startDay) {
                    profit = 0;
                    System.out.print("(" + startDay + " " + endDay + ") ");
                }
                startDay = i;
            }
            endDay = i;
        }

        // For last iteration
        if (endDay > startDay) {
            System.out.println("(" + startDay + " " + endDay + ")");
        } else {
            System.out.println("No Profit");
        }
    }
}
