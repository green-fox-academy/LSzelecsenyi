public class PostIt {
    public static void main(String[] args) {

        Notes note1 = new Notes("orange", "Idea 1", "blue");
        Notes note2 = new Notes("pink", "Awesome", "black");
        Notes note3 = new Notes("yellow", "Superb", "green");

        System.out.println("The backgroundcolor of the first note is " + note1.bgColor + ", it says: " + note1.notes + ", and it is written in " + note1.textColor + " color.");
        System.out.println("The backgroundcolor of the second note is " + note2.bgColor + ", it says: " + note2.notes + ", and it is written in " + note2.textColor + " color.");
        System.out.println("The backgroundcolor of the third note is " + note3.bgColor + ", it says: " + note3.notes + ", and it is written in " + note3.textColor + " color.");


    }

}

