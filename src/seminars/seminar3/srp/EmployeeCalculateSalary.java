package seminars.seminar3.srp;

public class EmployeeCalculateSalary {
    private int baseSalary;

    public EmployeeCalculateSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
    public int CalculateNetSalary() {
        int tax = (int)(baseSalary * 0.25); // calculate in otherway
        return baseSalary - tax;
    }
}
