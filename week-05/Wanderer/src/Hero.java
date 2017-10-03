public class Hero extends Character {

    public Hero() {
        maxHP = maxHP + super.d6.dice() + super.d6.dice() + super.d6.dice();

    }
}
