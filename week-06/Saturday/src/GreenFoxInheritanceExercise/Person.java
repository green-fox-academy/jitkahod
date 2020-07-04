package GreenFoxInheritanceExercise;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

public class Person {
     //Variables
    String name;
    int age;

    enum Gender {MALE, FEMALE};

    Gender gender;

    //Constructor
    Person (String name,int age,Gender gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    //Construktor bez parametru
    Person(){
        name = "Jane Doe";
        age = 30;
        gender = Gender.FEMALE;
    }

    //Methods
    public void introduce() {

        System.out.println("Hi, I'm" + name + ", a" + age + "year old" + gender + ".");
    }

    public void getGoal() {

        System.out.println("My goal is: Live for the moment!");
    }
}
