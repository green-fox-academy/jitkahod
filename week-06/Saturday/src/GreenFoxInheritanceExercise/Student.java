package GreenFoxInheritanceExercise;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

public class Student extends Person {

    String previousOrganization;
    int skippedDays;

    public Student(String name, int age, Gender gender, String previousOrganization) {
        super(name, age, gender);
        skippedDays = 0;
        this.previousOrganization = previousOrganization;
    }

    public Student() {
        super();
        previousOrganization = "School of Life";
        skippedDays = 0;
    }

    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public void introduce() {
        System.out.println("Hi, I'm" + name + ", a" + age + "year old" + gender + "from " + previousOrganization + " who skipped " + skippedDays + "days from the course already.");
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }


}
