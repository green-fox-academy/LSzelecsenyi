public class Hero extends Character {

    String picDown;
    String picUp;
    String picLeft;
    String picRight;

    public Hero() {
        maxHP = maxHP + d6.dice() + d6.dice() + d6.dice();
        defend = d6.dice() + d6.dice();
        strike = 5 + d6.dice();
        posX = 0;
        posY = 0;
        this.picDown = "Assets/hero-down.png";
        this.picUp = "Assets/hero-up.png";
        this.picLeft = "Assets/hero-left.png";
        this.picRight = "Assets/hero-right.png";
        this.defaultPic = this.picDown;
    }
}
