public class EncapsulationAbstractionDemo {
    public static void main(String[] args) {
        System.out.println("████████████████████████████████████████████████");
        System.out.println("  ENCAPSULATION & ABSTRACTION DEMONSTRATIONS");
        System.out.println("████████████████████████████████████████████████\n");

        System.out.println("\n=== 1. SHAPE HIERARCHY (ABSTRACTION) ===\n");
        Shape[] shapes = {
            new Circle(5),
            new Rectangle(4, 6),
            new Triangle(3, 4, 5),
            new Circle(7),
            new Rectangle(5, 8)
        };
        ShapeReport.printAreaReport(shapes);

        System.out.println("\n=== 2. EMPLOYEE PAYROLL SYSTEM ===\n");
        Employee[] employees = {
            new FullTimeEmployee("E001", "Rajesh Kumar", 50000),
            new FullTimeEmployee("E002", "Priya Singh", 60000),
            new PartTimeEmployee("E003", "Amit Patel", 500, 80),
            new ContractEmployee("E004", "Neha Sharma", 40000, 5000)
        };

        PayrollSystem payroll = new PayrollSystem(employees);
        payroll.displayAllEmployees();
        payroll.displayPayrollSummary();
        payroll.findHighestPaidEmployee();
        payroll.findEmployeeById("E002");

        System.out.println("\n=== 3. BANK ACCOUNT (ENCAPSULATION) ===\n");
        BankAccount account = new BankAccount("ACC001", "John Doe", 10000, 4.5);
        System.out.println("Initial Account Information:");
        account.displayAccountInfo();
        
        System.out.println("\nPerforming Transactions:");
        account.deposit(5000);
        account.withdraw(2000);
        account.applyInterest();
        
        System.out.println("\nFinal Account Information:");
        account.displayAccountInfo();

        System.out.println("\n=== 4. STUDENT GRADES (ENCAPSULATION) ===\n");
        int[] studentMarks = {85, 90, 78, 88, 92};
        Student student = new Student("S001", "Alice Johnson", studentMarks);
        student.displayStudentInfo();

        System.out.println("\n");
        System.out.println("Updating Student Marks...");
        int[] newMarks = {88, 92, 80, 90, 94};
        student.setMarks(newMarks);
        System.out.println("Updated Student Information:");
        student.displayStudentInfo();

        System.out.println("\n\n████████████████████████████████████████████████");
        System.out.println("  DEMONSTRATION COMPLETE");
        System.out.println("████████████████████████████████████████████████\n");
    }
}
