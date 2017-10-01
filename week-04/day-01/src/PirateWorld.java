public class n PirateWorld {

    public static void main(String[] args) {

        Pirate pirate1 = new Pirate();
        Pirate pirate2 = new Pirate();
        Pirate pirate3 = new Pirate();

        pirate1.drinkSomeRum();
        pirate1.drinkSomeRum();
        pirate1.drinkSomeRum();
        pirate1.drinkSomeRum();
        pirate1.drinkSomeRum();

        pirate2.drinkSomeRum();
        pirate2.drinkSomeRum();

        pirate3.die();

        pirate1.howsItGoingMate();
        System.out.println();
        pirate2.howsItGoingMate();
        System.out.println();
        pirate3.howsItGoingMate();
        System.out.println();

        brawl(pirate1, pirate2);

    }

    public static void brawl(Pirate pirate1, Pirate pirate2) {
        int dieOrNot = (int )(Math.random() * 3);
        System.out.println(pirate1.name + " and " + pirate2.name + " started to quarrel on a bottle of rum. It seems they will fight for it.");
        if (pirate1.dead == true) {
            System.out.println(pirate1.name + " is dead people cannot fight");
        } else if (pirate2.dead == true) {
            System.out.println(pirate2.name + " is dead. Dead people cannot fight");
        } else if (dieOrNot == 0) {
            pirate1.dead = true;
            System.out.println(pirate1.name + " died in duel");
        } else if (dieOrNot == 1) {
            pirate2.dead = true;
            System.out.println(pirate2.name + " died in duel");
        } else {
            System.out.println(pirate1.name + " and " + pirate2.name + " were too drunk to fight, they just simply passed out...");
        }
    }

}



