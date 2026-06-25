public class LibrarySystem {
    public static void printMemberDetails(LibraryMember[] members) {
        System.out.println("=== Library Members ===");
        for (LibraryMember member : members) {
            System.out.println("Name: " + member.getMemberName() + ", ID: " + member.getMemberId());
        }
    }

    public static void calculateAndDisplayFines(LibraryMember[] members, int overdueDays) {
        System.out.println("\n=== Fine Calculation ===");
        for (LibraryMember member : members) {
            double fine = member.calculateFine(overdueDays);
            System.out.println(member.getMemberName() + ": Rs. " + fine);
        }
    }

    public static void findMemberById(LibraryMember[] members, String searchId) {
        System.out.println("\n=== Search Result ===");
        for (LibraryMember member : members) {
            if (member.getMemberId().equals(searchId)) {
                System.out.println("Found: " + member.getMemberName() + " (ID: " + member.getMemberId() + ")");
                return;
            }
        }
        System.out.println("Member not found!");
    }
}
