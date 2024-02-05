package Model;

public class member {
    String name;
    int age;
    String contact;
    String address;
    int salary_per_day;

    public member(String name, int age, String contact, String address, int salary_per_day) {
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.address = address;
        this.salary_per_day = salary_per_day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary_per_day() {
        return salary_per_day;
    }

    public void setSalary_per_day(int salary_per_day) {
        this.salary_per_day = salary_per_day;
    }
    public double getSalary(int leaveDays) {
        int workingDays = 24 - leaveDays;
        return salary_per_day * workingDays;
    }
}
