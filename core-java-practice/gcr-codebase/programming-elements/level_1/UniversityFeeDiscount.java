class UniversityFeeDiscount {
    public static void main(String[] args) {
        double feeA = 125000;
        double discountPercentA = 10;
        double discountA = feeA * discountPercentA / 100;
        double discountedFeeA = feeA - discountA;

        System.out.println("The discount amount is INR " + discountA + " and final discounted fee is INR " + discountedFeeA);
    }
}
