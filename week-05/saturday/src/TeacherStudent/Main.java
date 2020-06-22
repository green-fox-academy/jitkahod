package TeacherStudent;

public class Main {
    public static void main(String args[]) {


        Student ingPlha = new Student();
        // docZubata.teach(ingPlha);

        Teacher docZubata = new Teacher();

        ingPlha.question(docZubata);

        docZubata.teach(ingPlha);
    }
}
