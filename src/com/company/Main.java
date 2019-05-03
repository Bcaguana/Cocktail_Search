package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test code for creating one drink with only a name.
        int option;
        char cont;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Type '1' to create a drink, or type '2' to search for a drink: ");
            option = Integer.parseInt(input.nextLine());
            //Checks which option selected, repeats question if invalid input
            if (option == 1) {
                createADrink();
            } else if (option == 2) {
                searchForDrink();
            } else {
                System.out.println("Invalid entry!");
            }
            System.out.println("Would you like to continue? (Y/N)");
            cont = input.nextLine().charAt(0);
            if (cont == 'N'){break;}
        }
    }
    private static void createADrink(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a drink name: ");
        String name = input.nextLine();
        Drink drink_1 = new Drink(name);
        System.out.println("Add ingredient? (Y/N)");
        char addIngredient = input.nextLine().charAt(0);
        while (addIngredient != 'N') {
            Ingredient addIngredient = input.nextLine().charAt(0);
        }

        System.out.println("The name of this drink is: " + drink_1.getName());
        }
    private static void searchForDrink(){
        System.out.println("Option in development.");
    }
}
