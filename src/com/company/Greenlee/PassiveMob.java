package com.company.Greenlee;

/**
 * Created by 061935 on 2/12/2020.
 */
public class PassiveMob {
    private String mob;
    private double health;
    private String droppedItems;
    private double speed;
    private String color;

    public PassiveMob(String mob, double health, String droppedItems, double speed, String color) {
        this.mob = mob;
        this.health = health;
        this.droppedItems = droppedItems;
        this.speed = speed;
        this.color = color;
    }

    public PassiveMob(double health, String droppedItems, double speed, String color) {
        this.health = health;
        this.droppedItems = droppedItems;
        this.speed = speed;
        this.color = color;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    @Override
    public String toString() {
        return "PassiveMob{" +
                "mob='" + mob + '\'' +
                ", health=" + health +
                ", droppedItems='" + droppedItems + '\'' +
                ", speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }
}
