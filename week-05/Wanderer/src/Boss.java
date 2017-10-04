public class Boss extends Character {

    String picBoss;

    public Boss() {
        maxHP = maxHP + d6.dice() + d6.dice() + d6.dice();
        defend = d6.dice() + d6.dice();
        strike = 5 + d6.dice();
        posX = 0;
        posY = 0;
        this.picBoss = "Assets/boss.png";
    }
}
