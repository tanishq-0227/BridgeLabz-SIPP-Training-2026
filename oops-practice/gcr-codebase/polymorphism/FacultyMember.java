public class FacultyMember extends LibraryMember {
    private static final double FINE_PER_DAY = 1.0;

    public FacultyMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * FINE_PER_DAY;
    }
}
