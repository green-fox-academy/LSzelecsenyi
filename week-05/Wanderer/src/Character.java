//every character has a (max and current) health point (HP), a defend (DP) and strike point (SP)
//        these values can change during the game
//        when a character's health point is 0 or below, it is dead
//        it disappears from the area
//        if its the hero, it is the end of the game

public class Character {
    int maxHP;
    int currentHP;
    int defend;
    int strike;
    int posX;
    int posY;
    Dice d6;
    String defaultPic;

public Character() {
    this.maxHP = maxHP;
    this.defend = defend;
    this.strike = strike;
    this.currentHP = maxHP;
    this.posX = posX;
    this.posY = posY;
    d6 = new Dice();
}
}
