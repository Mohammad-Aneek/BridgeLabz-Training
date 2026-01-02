public class ProfitOrLoss {
    public static void main(String[] args) {
        // Integer variables to store cost price and selling price
        int costPrice = 129, sellingPrice = 191;

        // find if the trade made profit or loss and
        // store the result in a String variable
        String tradeOutcome = costPrice < sellingPrice?"Profit":"Loss";

        // calculate and store the profit or loss
        int profitOrLoss = Math.abs(costPrice - sellingPrice);

        // calculate and store the profit or loss percenatge
        double profitOrLossPercentage = (double)(profitOrLoss * 100) /costPrice;

        // displaying the result
        System.out.println(
                "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + 
                "\nThe " + tradeOutcome + " is INR " + profitOrLoss + " and the " + tradeOutcome + " percenatge is "+profitOrLossPercentage
            );
    }
}
