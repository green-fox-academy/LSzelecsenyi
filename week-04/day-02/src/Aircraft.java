public class Aircraft {
    String type;
    int baseDamage;
    int maxAmmo;
    int currentAmmo;
    int allDamage;

    public Aircraft(String type, int baseDamage, int maxAmmo) {
        this.type = type;
        this.baseDamage = baseDamage;
        this.maxAmmo = maxAmmo;
        this.currentAmmo = 0;
        this.allDamage = baseDamage * currentAmmo;
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

    public int getBaseDamage() {
        return baseDamage;
    }

    public int getAllDamage() {
        return allDamage;
    }

    public int getCurrentAmmo() {
        return currentAmmo;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        String status;
        StringBuilder sb = new StringBuilder();
        sb.append("Type " + getType() + ", Ammo: " + getCurrentAmmo() + ", Base Damage: " + getBaseDamage() + ", All Damage: " + getAllDamage());
        return sb.toString();

    }
}