package com.company.Greenlee;

/**
 * Created by 061935 on 2/12/2020.
 */
public class NeutralMob {
    private String mob;
    private double health;
    private double attackPoints;
    private String neutrality;
    private String weapon;
    private String droppedItems;
    private String effects;
    private double speed;

    public NeutralMob(String mob, double health, double attackPoints, String neutrality, String weapon, String droppedItems, String effects, double speed) {
        this.mob = mob;
        this.health = health;
        this.attackPoints = attackPoints;
        this.neutrality = neutrality;
        this.weapon = weapon;
        this.droppedItems = droppedItems;
        this.effects = effects;
        this.speed = speed;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(double attackPoints) {
        this.attackPoints = attackPoints;
    }

    public String getNeutrality() {
        return neutrality;
    }

    public void setNeutrality(String neutrality) {
        this.neutrality = neutrality;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getDroppedItems() {
        return droppedItems;
    }

    public void setDroppedItems(String droppedItems) {
        this.droppedItems = droppedItems;
    }

    public String getEffects() {
        return effects;
    }

    public void setEffects(String effects) {
        this.effects = effects;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "NeutralMob{" +
                "mob='" + mob + '\'' +
                ", health=" + health +
                ", attackPoints=" + attackPoints +
                ", neutrality='" + neutrality + '\'' +
                ", weapon='" + weapon + '\'' +
                ", droppedItems='" + droppedItems + '\'' +
                ", effects='" + effects + '\'' +
                ", speed=" + speed +
                '}';
    }
}
