package HW12;

public class CollegeStudent extends Student{

    private int year;
    private String major;

    public void setYear(int year) {
        this.year = year;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public String getMajor() {
        return major;
    }

    public CollegeStudent(String name, int age, String gender, String idNumber, double gpa, int year, String major) {
        super(name, age, gender, idNumber, gpa);
        this.year = year;
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString() + ", Год: " + year + ", Мажор: " + major;
    }
}
