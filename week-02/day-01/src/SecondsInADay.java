// Write a program that prints the remaining seconds (as an integer) from a
// day if the current time is represented bt the variables

public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int remainingHours = (24 - 1) - currentHours;
        int remainingMinutes = (60 - 1) - currentMinutes;
        int remainingSeconds = 60 - currentSeconds;

        int remainingTime = (remainingHours * 60 * 60) + (remainingMinutes * 60) + (remainingSeconds);
        System.out.println(remainingTime);
    }
}
