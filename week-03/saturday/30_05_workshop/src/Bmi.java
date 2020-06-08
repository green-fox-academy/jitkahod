public class Bmi {
    public static void main(String[] args) {
        double massInKg = 51.0;
        double heightInM = 1.59;
        double Bmi;

        // Print the Body mass index (BMI) based on these values //bmi= massInKg/(hightInM * heightInM)

        Bmi = massInKg / (heightInM * heightInM);
        System.out.println(Bmi);
    }
}