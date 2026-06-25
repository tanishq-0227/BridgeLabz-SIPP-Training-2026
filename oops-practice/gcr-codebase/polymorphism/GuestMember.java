public class GuestMember extends LibraryMember {
    private static final double FINE_PER_DAY = 5.0;

    public GuestMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * FINE_PER_DAY;
    }
}
