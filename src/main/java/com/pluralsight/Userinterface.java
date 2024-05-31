package com.pluralsight;

import java.util.Scanner;

public class Userinterface {
    private Order neworder;
    private Scanner scanner;


    public void orderScreen() {
        Scanner scanner = new Scanner(System.in);

    }

    public void display() {
        while (true) {
            System.out.println("Welcome to Deli-Way");
            System.out.println("1. New Order");
            System.out.println("2. Exit");
            System.out.println("Select an option");
            int choice = scanner.nextInt();

            if (choice == 1) {
                handleOrder();
            } else if (choice == 2) {
                System.out.println("Thank you , Have a good day!");
                break;
            } else {
                System.out.println("Invalid choice , please select 1 or 2");

            }
        }
        scanner.close();

    }

    private static void handleOrder() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nOrder Screen: ");
            System.out.println("1. Add Sandwich");
            System.out.println("2. Add Drink");
            System.out.println("3. Add Chips");
            System.out.println("4. Checkout");
            System.out.println("5. Cancel Order");
            System.out.println("Select an option: ");
            int orderChoice = scanner.nextInt();

            switch (orderChoice) {
                case 1:
                    addSandwich();
                    break;
                case 2:
                    addDrink();
                    break;
                case 3:
                    addChips();
                    break;
                case 4:
                    checkout();
                    break;
                case 5:
                    System.out.println("Order canceled.");
                    return;
                default:
                    System.out.println("Invalid choice. Please select 1 to 5.");
            }
        }
    }

    private static void addSandwich() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nAdd Sandwich:");
        System.out.println("1. White Bread");
        System.out.println("2. Wheat Bread");
        System.out.println("3. Rye Bread");
        System.out.print("Select bread type (1-3): ");
        int breadChoice = scanner.nextInt();

        String breadType;
        switch (breadChoice) {
            case 1:
                breadType = "White Bread";
                break;
            case 2:
                breadType = "Wheat Bread";
                break;
            case 3:
                breadType = "Rye Bread";
                break;
            case 4:
                breadType = "Wrap";
                break;
            default:
                System.out.println("Invalid choice. Please select from choices");
                breadType = "White Bread";
        }
        System.out.println("Selected bread type: " + breadType);
    }



        private static void addDrink(){
                Scanner scanner = new Scanner(System.in);

                System.out.println("\nAdd Drink:");
                System.out.println("1. Cola");
                System.out.println("2. Lemonade");
                System.out.println("3. Iced Tea");
                System.out.print("Select drink type (1-3): ");
                int drinkChoice = scanner.nextInt();

                String drinkType;
                switch (drinkChoice) {
                    case 1:
                        drinkType = "Cola";
                        break;
                    case 2:
                        drinkType = "Lemonade";
                        break;
                    case 3:
                        drinkType = "Iced Tea";
                        break;
                    default:
                        System.out.println("Invalid choice. Please use options above");
                        drinkType = "Cola";
                }

                System.out.println("Selected drink type: " + drinkType);



            }


        private static void addChips(){

            Scanner scanner = new Scanner(System.in);

            System.out.println("\nSelect Chips:");
            System.out.println("1. Regular");
            System.out.println("2. Barbecue");
            System.out.println("3. Sour Cream");
            System.out.print("Enter your choice(s): ");
            String input = scanner.nextLine();
            int Chipchoice = scanner.nextInt();

            String chipType;
            switch (Chipchoice) {
                case 1:
                    chipType = "Regular" ;
                    break;
                case 2:
                    chipType = "Barbecue";
                    break;
                case 3:
                    chipType = "Sour Cream";
                    break;
                default:
                    System.out.println("Invalid choice. Please use choices above");
                    chipType = "Regular";
            }

            System.out.println("Selected Chip type: " + chipType);


        }



        }

        private static void checkout(){


                double smallSandwichPrice = 5.50;
                double mediumSandwichPrice = 7.00;
                double largeSandwichPrice = 8.50;

                double smallDrinkPrice = 2.00;
                double mediumDrinkPrice = 2.50;
                double largeDrinkPrice = 3.00;

                double chipsPrice = 1.50;

                double total = 0.0;


                if (neworder != null) {
                    total += smallSandwichPrice * neworder.getSmallSandwichCount();
                    total += mediumSandwichPrice * neworder.getMediumSandwichCount();
                    total += largeSandwichPrice * neworder.getLargeSandwichCount();

                    total += smallDrinkPrice * neworder.getSmallDrinkCount();
                    total += mediumDrinkPrice * neworder.getMediumDrinkCount();
                    total += largeDrinkPrice * neworder.getLargeDrinkCount();

                    total += chipsPrice * neworder.getChipsCount();


               
                System.out.println("Total amount: $" + total);


            }








        }



