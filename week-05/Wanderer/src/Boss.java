public class Boss extends Character {

    String picBoss;
    int bossLevel;

    public Boss() {
        super("Assets/boss.png", 1, 0);
//        this.bossLevel = level;
        maxHP = maxHP + d6.dice() + d6.dice() + d6.dice();
        defend = d6.dice() + d6.dice();
        strike = 5 + d6.dice();
        this.posX = (int) (10.0 * Math.random());
        this.posY = (int) (10.0 * Math.random());
        this.picBoss = "Assets/boss.png";
    }

}
