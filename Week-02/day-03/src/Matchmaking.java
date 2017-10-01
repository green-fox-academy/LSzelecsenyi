import java.util.*;

public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));

        // Join the two lists by matching one girl with one boy in the order list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        ArrayList<String> order = matchMaker(girls, boys);
        System.out.println(order);

    }

    public static ArrayList<String> matchMaker(ArrayList<String> girls, ArrayList<String> boys) {
        ArrayList<String> order = new ArrayList<String>();
        for (int i = 0; i < girls.size(); i++) {
            order.add(girls.get(i));
            order.add(boys.get(i));
        }
        if (boys.size() > girls.size()) {                                  //if one of the input lists are longer add the difference to the end of order list
            int difference = boys.size() - girls.size();
            for (int i = 0; i < difference; i++) {
                order.add(boys.get((order.size() / 2) + i));
            }
        } else if (boys.size() < girls.size()) {
            int difference2 = girls.size() - boys.size();
            for (int i = 0; i < difference2; i++) {
                order.add(girls.get((order.size() / 2) + i));
            }
        }return order;
    }

}