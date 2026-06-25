public class StudentMember extends LibraryMember {
    private static final double FINE_PER_DAY = 2.0;

    public StudentMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * FINE_PER_DAY;
    }
}
