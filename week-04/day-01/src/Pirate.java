public class Pirate {

    String[] names1 = {"Ol'", "Stinky", "Creeps", "One Eye", "Captain", "Fishy", "Rouge", "Sharkbait", "Red", "Sticky", "Ghost", "Whale", "Flying", "Cutlass", "King", "Ironhook", "Mad"};
    String[] names2 = {"Lagoon", "Barnacle", "Creepy", "Plank", "Slappy", "Beard", "Hook", "Crabbe", "Blubber", "Broom", "Treasure", "One/Ear", "Claw", "Parrot", "Flag", "Stubbs", "Gutt"};
    String[] names3 = {"Sea", "Joe", "Pants", "Swashbuckler", "McGee", "Leggs", "Smuggler", "Fishhawk", "Jack", "Moonscar", "Featherswor", "Rat Breath", "Skurvy", "Sea Rat", "Silver", "Slag", "Turner"};

    int rumConsumed = 0;
    boolean dead = false;
    String name = names1[(int)(Math.random() * names1.length)] + " " + names2[(int)(Math.random() * names2.length)] + " " + names3[(int)(Math.random() * names3.length)];


    public void die() {
        this.dead = true;
    }

    public void drinkSomeRum() {
        this.rumConsumed++;
    }

    public void howsItGoingMate() {
        if (dead == true) {
            System.out.println(name + " is dead");
        }
        else if (rumConsumed >= 4) {
            System.out.println(name + " says: \n \"Arghh, I'ma Pirate! The famous " + name + " and I'm drinkin rum. How d'ya d'ink its goin?\", \n" + name + " collapses and passes out.");
        } else {
            System.out.println(name + " says: \n \"Pour me anudder or yu'llbe killed by the famous " + name + " you bloody bastard!\n");
        }
    }



}
