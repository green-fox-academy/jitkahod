package GreenFoxInheritanceExercise;

public class Sponsor extends Person {
    //fields
    String company;
    int hiredStudents;

    //constructor
    public Sponsor(String name, int age, Gender gender, String company) {
        super(name, age, gender);
        hiredStudents = 0;
    }

    public Sponsor() {
        super();
        company = "Google";
        hiredStudents = 0;

    }

    //methods
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + "who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

    public void hire() {
        hiredStudents += 1;
    }

    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }

}
