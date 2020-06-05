public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int secondsInDay = 24*60*60;
        int remainingSec;


        // Write a program that prints the remaining seconds (as an integer) from a day if the current time is represented by the variables
        remainingSec = secondsInDay - (currentHours*60*60 + currentMinutes*60 + currentSeconds);
        System.out.println("Remaining seconds from a day :" + remainingSec);

        System.out.println("h: " +remainingSec / 3600);
        System.out.println("min: " +(remainingSec % 3600) / 60);
        System.out.println("sec: " +((remainingSec % 3600) % 60));
    }
}
