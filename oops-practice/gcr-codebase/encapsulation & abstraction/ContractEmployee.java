public class ContractEmployee extends Employee {
    private double contractAmount;
    private double bonus;

    public ContractEmployee(String employeeId, String employeeName, double contractAmount, double bonus) {
        super(employeeId, employeeName);
        this.contractAmount = contractAmount;
        this.bonus = bonus;
    }

    public double getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(double contractAmount) {
        this.contractAmount = contractAmount;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return contractAmount + bonus;
    }
}
