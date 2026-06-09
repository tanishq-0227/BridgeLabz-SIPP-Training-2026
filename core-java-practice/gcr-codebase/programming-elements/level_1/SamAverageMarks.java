class SamAverageMarks {
    public static void main(String[] args) {
        String nameA = "Sam";
        double mathsMarksA = 94;
        double physicsMarksA = 95;
        double chemistryMarksA = 96;
        double maxMarksA = 100;
        double totalMarksA = mathsMarksA + physicsMarksA + chemistryMarksA;
        double totalSubjectsA = 3;
        double averageMarksA = totalMarksA / totalSubjectsA;

        System.out.println(nameA + "'s average mark in PCM is " + averageMarksA);
    }
}
