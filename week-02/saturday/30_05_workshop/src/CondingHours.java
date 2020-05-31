public class CondingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        int semestrLength = 17;
        int codingPerDay = 6;

        int codingPerWeek = codingPerDay * 5;//working days
        int condignPerSemester = semestrLength * codingPerWeek;
        float condingPercentagePerWeek = codingPerWeek/(52f*100f);

        // Print how many hours is spent with coding in a semester by an attendee,
       // if the attendee only codes on workdays.
        System.out.println(condignPerSemester);

        // Print the percentage of the coding hours in the semester if the average work hours weekly is 52h
        System.out.println(condingPercentagePerWeek);



    }
}
