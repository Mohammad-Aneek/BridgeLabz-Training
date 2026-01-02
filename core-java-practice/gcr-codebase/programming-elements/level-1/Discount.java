// to calculate discount in fee and discounted fee
public class Discount {
    public static void main(String[] args) {
        // the curent University fee 
        double fee = 125000;

        // discount percentage
        double discountPercent = 10;

        // discount amount
        double discountAmount = fee * discountPercent / 100;

        // discounted fee
        double discountedFee = fee - discountAmount;

        // displaying the data 
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + discountedFee);
    }
}
