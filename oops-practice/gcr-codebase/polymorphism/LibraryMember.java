public abstract class LibraryMember {
    protected String memberName;
    protected String memberId;

    public LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    public abstract double calculateFine(int overdueDays);

    public String getMemberName() {
        return memberName;
    }

    public String getMemberId() {
        return memberId;
    }
}
