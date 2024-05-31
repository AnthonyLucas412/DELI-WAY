package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    private Order neworder;
    private Scanner scanner;

    public UserInterface() {
        scanner = new Scanner(System.in);
    }


    public void display() {
        while (true) {
            System.out.println("Welcome to DELI-WAY");
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
            System.out.println("2. Add Meats");
            System.out.println("3. Add Toppings");
            System.out.println("4. Add Cheeses");
            System.out.println("5. Add Drink");
            System.out.println("6. Add Chips");
            System.out.println("7. Check out");
            System.out.println("8. Cancel order");
            System.out.println("Select an option: ");
            int orderChoice = scanner.nextInt();

            switch (orderChoice) {
                case 1:
                    addSandwich();
                    break;
                case 2:
                    addMeats();
                case 3:
                    addToppings();
                    break;
                case 4:
                    addCheese();
                    break;
                case 5 :
                    addDrink();
                    break;
                case 6:
                    addChips();
                    break;
                case 7:
                    checkout();
                    break;
                case 8:
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


    private static void addToppings() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nAdd Toppings:");
        System.out.println("1.Lettuce");
        System.out.println("2.Peppers");
        System.out.println("3.Onions");
        System.out.println("4.Tomatoes");
        System.out.println("5.Jalapenos");
        System.out.println("6.Cucumbers");
        System.out.println("7.Pickles");
        System.out.println("8.Guacamole");
        System.out.println("9.Mushrooms");
        System.out.println("Select Toppings (1-9): ");
        int toppingsChoice = scanner.nextInt();

        String toppingType;
        switch (toppingsChoice) {
            case 1:
                toppingType = "Lettuce";
                break;
            case 2:
                toppingType = "Peppers";
                break;
            case 3:
                toppingType = "Onions";
                break;
            case 4:
                toppingType = "Tomatoes";
                break;
            case 5:
                toppingType = "Jalapenos";
                break;
            case 6:
                toppingType = "Cucumbers";
                break;
            case 7:
                toppingType = "Pickles";
                break;
            case 8:
                toppingType = "Guacamole";
                break;
            case 9:
                toppingType = "Mushrooms";
                break;
            default:
                System.out.println("Invalid choice. Please use options above");
                toppingType = "Lettuce";

        }
        System.out.println("Selected topping type: " + toppingType);
    }





    private static void addMeats() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nAdd Meats:");
        System.out.println("Steak");
        System.out.println("Ham");
        System.out.println("Salami");
        System.out.println("Roast beef");
        System.out.println("Chicken");
        System.out.println("Bacon");
        int meatsChoice = scanner.nextInt();

        String meatsType;
        switch (meatsChoice) {
            case 1:
                meatsType = "Lettuce";
                break;
            case 2:
                meatsType = "Peppers";
                break;
            case 3:
                meatsType = "Onions";
                break;
            case 4:
                meatsType = "Tomatoes";
                break;
            case 5:
                meatsType = "Jalapenos";
                break;
            case 6:
                meatsType = "Cucumbers";
                break;
        }
    }

        private static void addCheese() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("\nAdd Cheese:");
            System.out.println("American");
            System.out.println("Provolone");
            System.out.println("Cheddar");
            System.out.println("Swiss");
            System.out.println("Select Cheese type");
            int cheeseChoice = scanner.nextInt();

            String cheeseType;
            switch (cheeseChoice) {
                case 1:
                    cheeseType = "American";
                    break;
                case 2:
                    cheeseType = "Provolone";
                    break;
                case 3:
                    cheeseType = "Cheddar";
                    break;
                case 4:
                    cheeseType = "Swiss";
                    break;
                default:
                    System.out.println("Invalid choice. Please use options above");
                    cheeseType = "American";
                    System.out.println("Selected cheese type: " + cheeseType);

            }
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
    public static void checkout() {


        double smallSandwichPrice = 5.50;
        double mediumSandwichPrice = 7.00;
        double largeSandwichPrice = 8.50;

        double smallDrinkPrice = 2.00;
        double mediumDrinkPrice = 2.50;
        double largeDrinkPrice = 3.00;

        double chipsPrice = 1.50;

        double total = 0.0;

        Order neworder = new Order();
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




