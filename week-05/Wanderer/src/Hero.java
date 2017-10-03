public class Hero extends Character {

    public Hero() {
        maxHP = maxHP + d6.dice() + d6.dice() + d6.dice();


    }
}
