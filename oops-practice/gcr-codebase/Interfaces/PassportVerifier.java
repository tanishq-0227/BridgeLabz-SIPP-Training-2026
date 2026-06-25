public interface PassportVerifier {
    void verifyPassport(String passportNo);

    default void displaySecurityGuidelines() {
        System.out.println("Passport Security: Verify validity and authenticity of documents.");
    }

    static boolean isPassportNumberValid(String passportNo) {
        return passportNo.length() == 9 && passportNo.matches("[A-Z0-9]+");
    }
}
