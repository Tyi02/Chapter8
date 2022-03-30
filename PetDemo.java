package com.CSCI185;

import java.util.Scanner;

public class PetDemo {
    public static void main(String[] args) {
//        Hamster hamtaro = new Hamster();
//        hamtaro.setName("Hamtaro");
//        commandPet(hamtaro);

        Pet[] petStore = new Pet[4];
        petStore[0] = new Hamster("Hamtaro");
        petStore[1] = new Cat("Boots");
        petStore[2] = new StrayDog();
        petStore[3] = new Cat("Haku");

        for(Pet pet:petStore)
        {
            commandPet(pet);
        }


    }
    public static void commandPet(Pet myPet)
    {
        System.out.println(myPet.getName()+" comes up to you.");
       myPet.doTrick();
    }

    public static void namePet(Pet myPet)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("WHat would you like to name this pet?");
        String name = keyboard.nextLine();
        myPet.setName(name);
    }
}
