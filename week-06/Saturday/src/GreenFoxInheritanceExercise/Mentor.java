package GreenFoxInheritanceExercise;

public class Mentor extends Person {
    //fields
    String level;


    //constructors
    public Mentor(String name, int age, Gender gender, String level) {
    }

    public Mentor() {
        super();
        level = "intermediate";
    }

    //methods
    @Override
    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + "" + level + " mentor.");
    }
}

