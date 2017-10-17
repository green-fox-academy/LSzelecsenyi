package Reservations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Reservations implements ResInterface{

    public void getReservation(int howMany) {

        for (int i = 0; i < howMany; i++) {
            System.out.println(("Booking# " + getCodeBooking()  +" for " + getDowBooking()));
        }
    }


    @Override
    public String getDowBooking() {
        ArrayList<String> dow = new ArrayList<>(Arrays.asList("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"));
        Random r = new Random();
        int randomInt = r.nextInt(7) + 1;
        return dow.get(randomInt -1);
    }

    @Override
    public String getCodeBooking() {
        final String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            Random r = new Random();
            int randomInt = r.nextInt(alphabet.length()) + 1;
            sb.append(alphabet.charAt(randomInt - 1));
        }
        return sb.toString();
    }
}
