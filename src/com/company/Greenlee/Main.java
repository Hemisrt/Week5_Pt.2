package com.company.Greenlee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player steve = new Player("Steve", 10, "Diamond Sword", 10);

        PassiveMob sheep = new PassiveMob("Sheep", 10, "Wool", 15, "White");

        NeutralMob bee = new NeutralMob("Bee",20.0,2.5,"Passive","Stinger","None", "Poison", 30);

        HostileMob stray = new HostileMob("Stray", 20, 15, "Slowness", "Bow", "Bones", 25);

        /*System.out.println(steve);
        System.out.println(sheep);
        System.out.println(bee);
        System.out.println(stray);*/

        System.out.println("Decide what Steve should do. Press 0 to exit." +
                "\n(1) - Attack");

        int prompt = input.nextInt();
        switch (prompt) {
            case 1:
                steve.attack(stray);
                stray.attack(steve);
                break;
            default:
                System.out.println("Error.");
                break;
        }
    }

    private static Scanner input = new Scanner(System.in);
}
