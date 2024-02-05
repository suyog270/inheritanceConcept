package Model;

public class Manager extends member {

    String specialization;

    public Manager(String name, int age, String contact, String address, int salary_per_day, String specialization) {
        super(name, age, contact, address, salary_per_day);
        this.specialization = specialization;
    }

    @Override
    public double getSalary(int leaveDays) {
        double baseSalary = super.getSalary(leaveDays);
        double salaryFactor = 1;

        if (specialization == "A") {
            salaryFactor = 5;
        } else if (specialization == "B") {
            salaryFactor = 9;
        }

        return baseSalary * salaryFactor;

    }
}
