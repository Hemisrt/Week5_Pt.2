package com.company.Greenlee;

/**
 * Created by 061935 on 2/12/2020.
 */
public class Player {
    private String name;
    private double health;
    private String weapon;
    private double speed;

    public Player(String name, double health, String weapon, double speed) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void attack(HostileMob a) {
        System.out.println(this.getName() + " attacks a " + a.getMob());
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", weapon='" + weapon + '\'' +
                ", speed=" + speed +
                '}';
    }
}
