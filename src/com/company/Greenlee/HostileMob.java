package com.company.Greenlee;

/**
 * Created by 061935 on 2/12/2020.
 */
public class HostileMob {
    private String mob;
    private double health;
    private double attackPoints;
    private String effects;
    private String weapon;
    private String droppedItems;
    private double speed;

    public HostileMob(String mob, double health, double attackPoints, String effects, String weapon, String droppedItems, double speed) {
        this.mob = mob;
        this.health = health;
        this.attackPoints = attackPoints;
        this.effects = effects;
        this.weapon = weapon;
        this.droppedItems = droppedItems;
        this.speed = speed;
    }

    public HostileMob(int health, int attackPoints, String effects, String weapon, String items) {
        this.health = health;
        this.attackPoints = attackPoints;
        this.effects = effects;
        this.weapon = weapon;
        this.droppedItems = droppedItems;
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

    public void setHealth(int health) {
        this.health = health;
    }

    public double getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public String getEffects() {
        return effects;
    }

    public void setEffects(String effects) {
        this.effects = effects;
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

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getItems() {
        return droppedItems;
    }

    public void setItems(String items) {
        this.droppedItems = droppedItems;
    }

    public void attack(Player a) {
        System.out.println("Stray kills Steve. Game over.");
    }

    @Override
    public String toString() {
        return "HostileMob{" +
                "mob='" + mob + '\'' +
                ", health=" + health +
                ", attackPoints=" + attackPoints +
                ", effects='" + effects + '\'' +
                ", weapon='" + weapon + '\'' +
                ", droppedItems='" + droppedItems + '\'' +
                ", speed=" + speed +
                '}';
    }
}
