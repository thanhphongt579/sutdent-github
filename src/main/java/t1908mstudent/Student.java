package t1908mstudent;

public class Student {
    private String rollNumber;
    private String name;
    private String phone;

    public Student() {

    }

    public Student(String rollNumber, String name, String phone) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.phone = phone;
    }


    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
