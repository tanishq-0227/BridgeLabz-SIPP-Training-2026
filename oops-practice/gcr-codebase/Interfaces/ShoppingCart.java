public class ShoppingCart implements CouponValidator {
    private String[] validCodes = {"SAVE50", "WELCOME20", "DISCOUNT30", "SUMMER10"};

    @Override
    public boolean validateCoupon(String code) {
        if (!CouponValidator.isLengthValid(code)) {
            return false;
        }
        for (String validCode : validCodes) {
            if (validCode.equalsIgnoreCase(code)) {
                return true;
            }
        }
        return false;
    }

    public void checkCoupons(String[] coupons) {
        System.out.println("=== Coupon Validation ===");
        for (String coupon : coupons) {
            if (validateCoupon(coupon)) {
                System.out.println(coupon + " - VALID");
            } else {
                System.out.println(coupon + " - INVALID");
            }
        }
    }
}
