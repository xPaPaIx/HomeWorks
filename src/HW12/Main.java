package HW12;

public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Coach Bob", 27, "M"),
                new Student("Lynne Brooke", 16, "F","HS95129", 3.5),
                new Teacher("Duke Java",34,"M","Computer Science",50000.0),
                new CollegeStudent("Ima Frosh",18,"F","UCB123", 4.0, 1,"English")

        };

        for (Person person : persons){
            System.out.println(person.toString());
        }
    }
}

