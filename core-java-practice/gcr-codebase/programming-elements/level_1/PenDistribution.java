class PenDistribution {
    public static void main(String[] args) {
        int totalPensA = 14;
        int numberOfStudentsA = 3;
        int pensPerStudentA = totalPensA / numberOfStudentsA;
        int remainingPensA = totalPensA % numberOfStudentsA;

        System.out.println("The Pen Per Student is " + pensPerStudentA + " and the remaining pen not distributed is " + remainingPensA);
    }
}
