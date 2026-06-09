class ProfitLossCalculator {
    public static void main(String[] args) {
        double costPriceA = 129;
        double sellingPriceA = 191;
        double profitA = sellingPriceA - costPriceA;
        double profitPercentageA = profitA / costPriceA * 100;

        System.out.println("The Cost Price is INR " + costPriceA + " and Selling Price is INR " + sellingPriceA + "\nThe Profit is INR " + profitA + " and the Profit Percentage is " + profitPercentageA);
    }
}
