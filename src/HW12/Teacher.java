package HW12;

public class Teacher extends Person {

    private double salary;
    private String subject;




    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public String getSubject() {
        return subject;
    }

    public Teacher(String name, int age, String gender,  String subject, double salary) {
        super(name, age, gender);
        this.salary = salary;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() + ", Зарплата: " + salary + ", Предмет: " + subject;
    }
}
