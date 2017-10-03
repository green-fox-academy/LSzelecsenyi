public class Aircraft {
    String type;
    int baseDamage;
    int maxAmmo;
    int currentAmmo;

public Aircraft(String type, int baseDamage, int maxAmmo) {
    this.type = type;
    this.baseDamage = baseDamage;
    this.maxAmmo = maxAmmo;
    this.currentAmmo = 0;
}

public int fight(Aircraft aircraft) {
    int damage = baseDamage * currentAmmo;
    currentAmmo = 0;
    return damage;
}

public int refill(int ammo) {
    int ammoNeeded = maxAmmo - currentAmmo;
    currentAmmo = maxAmmo;
    return ammo - ammoNeeded;
}

public String getType() {
    return type;
}
    
}