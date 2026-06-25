public class PayrollSystem {
    private Employee[] employees;

    public PayrollSystem(Employee[] employees) {
        this.employees = employees;
    }

    public void displayAllEmployees() {
        System.out.println("========================================");
        System.out.println("        PAYROLL SYSTEM - ALL EMPLOYEES");
        System.out.println("========================================\n");
        
        for (Employee emp : employees) {
            emp.displayEmployeeInfo();
            System.out.println("----------------------------------------");
        }
    }

    public double calculateTotalPayroll() {
        double total = 0;
        for (Employee emp : employees) {
            total += emp.calculateSalary();
        }
        return total;
    }

    public void displayPayrollSummary() {
        System.out.println("\n========================================");
        System.out.println("        PAYROLL SUMMARY");
        System.out.println("========================================");
        System.out.println("Total Employees: " + employees.length);
        System.out.println("Total Payroll: Rs. " + calculateTotalPayroll());
        System.out.println("Average Salary: Rs. " + (calculateTotalPayroll() / employees.length));
        System.out.println("========================================\n");
    }

    public void findHighestPaidEmployee() {
        System.out.println("========================================");
        System.out.println("        HIGHEST PAID EMPLOYEE");
        System.out.println("========================================");
        
        Employee highest = employees[0];
        for (Employee emp : employees) {
            if (emp.calculateSalary() > highest.calculateSalary()) {
                highest = emp;
            }
        }
        
        System.out.println("Name: " + highest.getEmployeeName());
        System.out.println("ID: " + highest.getEmployeeId());
        System.out.println("Salary: Rs. " + highest.calculateSalary());
        System.out.println("========================================\n");
    }

    public void findEmployeeById(String employeeId) {
        System.out.println("========================================");
        System.out.println("        SEARCH RESULT");
        System.out.println("========================================");
        
        for (Employee emp : employees) {
            if (emp.getEmployeeId().equals(employeeId)) {
                emp.displayEmployeeInfo();
                System.out.println("========================================\n");
                return;
            }
        }
        System.out.println("Employee not found!");
        System.out.println("========================================\n");
    }
}
