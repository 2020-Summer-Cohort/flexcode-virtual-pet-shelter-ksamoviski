package shelter;

import javax.swing.*;
import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VirtualPetShelter myVirtualPetShelter = new VirtualPetShelter();

        VirtualPet pet1 = new VirtualPet("George", "Fluffy Orange Cat", 20, 20, 20);
        VirtualPet pet2 = new VirtualPet("Dot", "Sly Tabby Cat", 20, 20, 20);

        myVirtualPetShelter.add(pet1);
        myVirtualPetShelter.add(pet2);

        String userChoice;

        do{
            System.out.println("Welcome! These are our pets");
            myVirtualPetShelter.showPets();

            System.out.println("What would you like to do?");
            System.out.println("Choose an option");
            System.out.println("Press 1 to feed a pet");
            System.out.println("Press 2 to give a pet a drink");
            System.out.println("Press 3 to play with a pet");
            System.out.println("Press 4 to adopt a pet");
            System.out.println("Press 5 to intake a pet");
            System.out.println("Press 6 to exit");
            userChoice = input.nextLine();

            if (userChoice.equals("1")){
                System.out.println("You want to feed a pet");
                System.out.println("Here are our pets");
                myVirtualPetShelter.showPets();

                System.out.println("Which pet would you like to feed?");
                String petName = input.nextLine();
                myVirtualPetShelter.eat();
                System.out.println("Getting fuller!");
                System.out.println("Hunger = " + myVirtualPetShelter.getHungerLevel());

            }else if(userChoice.equals("2")){
                System.out.println("You want to a pet a drink");
                System.out.println("Here are our pets");
                myVirtualPetShelter.showPets();

                System.out.println("Which pet would you like to give a drink?");
                String petName = input.nextLine();
                myVirtualPetShelter.drink();
                System.out.println("mmmm... milk, my favorite!");
                System.out.println("Thirst = " + myVirtualPetShelter.getThirstLevel());

            }else if(userChoice.equals("3")){
                System.out.println("You want to play with a pet");
                System.out.println("Here are our pets");
                myVirtualPetShelter.showPets();

                System.out.println("Which pet would you like to play with");
                String petName = input.nextLine();
                myVirtualPetShelter.play();
                System.out.println("That was fun!");
                System.out.println("Energy = " + myVirtualPetShelter.getPlayLevel());

            }else if(userChoice.equals("4")){
                System.out.println("You want to adopt a pet");
                System.out.println("Here are our pets");
                myVirtualPetShelter.showPets();

                System.out.println("Which pet would you like to adopt");
                String petName = input.nextLine();
                myVirtualPetShelter.close(petName, petToRemove);
                System.out.println("I can't wait to see my new home");

            }else if(userChoice.equals("5")){
                System.out.println("You want to drop off a pet");
                System.out.println("What is the name of your pet?");
                String petName = input.nextLine();
                myVirtualPetShelter.add(petName, petToAdd);
                System.out.println("Sorry your pet didn't work out.");
            }
        } while (!userChoice.equals("6"));
        System.out.println("Thanks for visiting with us today");
    }
}
