package Model;

public class member {
    String name;
    int age;
    String contact;
    String address;
    int salary;
    int daysLeave;

    public member(int daysLeave) {
        this.daysLeave = daysLeave;
    }

    public member(String name, int age, String contact, String address, int salary) {
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.address = address;
        this.salary = salary;
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

    public int getDaysLeave() {
        return daysLeave;
    }

    public void setDaysLeave(int daysLeave) {
        this.daysLeave = daysLeave;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void getInfo(){
        System.out.println("these are the members");
    }
}
