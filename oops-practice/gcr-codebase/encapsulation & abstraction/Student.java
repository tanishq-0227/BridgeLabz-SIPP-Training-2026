public class Student {
    private String studentId;
    private String studentName;
    private int[] marks;
    private final int maxMarks = 100;

    public Student(String studentId, String studentName, int[] marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int[] getMarks() {
        return marks.clone();
    }

    public void setMarks(int[] marks) {
        if (isValidMarks(marks)) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Marks should be between 0 and 100.");
        }
    }

    private boolean isValidMarks(int[] marks) {
        for (int mark : marks) {
            if (mark < 0 || mark > maxMarks) {
                return false;
            }
        }
        return true;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    public String getGrade() {
        double average = calculateAverage();
        if (average >= 90) return "A+";
        if (average >= 80) return "A";
        if (average >= 70) return "B";
        if (average >= 60) return "C";
        if (average >= 50) return "D";
        return "F";
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("  Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Average: " + String.format("%.2f", calculateAverage()));
        System.out.println("Grade: " + getGrade());
    }
}
