public class AirportSecuritySystem implements LuggageScanner, PassportVerifier {

    @Override
    public void scanLuggage(String passportNo) {
        System.out.println("Scanning luggage for passenger: " + passportNo);
    }

    @Override
    public void verifyPassport(String passportNo) {
        System.out.println("Verifying passport: " + passportNo);
    }

    @Override
    public void displaySecurityGuidelines() {
        System.out.println("Airport Security: Verify documents and scan luggage before boarding.");
    }

    public void checkPassenger(String passportNo) {
        System.out.println("\n--- Passenger Check ---");
        if (PassportVerifier.isPassportNumberValid(passportNo)) {
            verifyPassport(passportNo);
            scanLuggage(passportNo);
            System.out.println("Status: CLEARED TO BOARD");
        } else {
            System.out.println("Status: INVALID PASSPORT - NOT ALLOWED TO BOARD");
        }
    }

    public void processPassengers(String[] passports) {
        displaySecurityGuidelines();
        for (String passport : passports) {
            checkPassenger(passport);
        }
    }
}
