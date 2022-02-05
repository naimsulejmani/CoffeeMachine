package machine;

import java.util.Locale;
import java.util.Scanner;

enum CoffeeProduct {
    ESPRESSO(4, 250, 0, 16),
    LATTE(7, 350, 75, 20),
    CAPPUCCINO(6, 200, 100, 12);

    private final int price;
    private final int water;
    private final int milk;
    private final int coffeeBeanse;

    CoffeeProduct(int price, int water, int milk, int coffeeBeans) {
        this.price = price;
        this.water = water;
        this.milk = milk;
        this.coffeeBeanse = coffeeBeans;
    }

    public int getPrice() {
        return price;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeanse() {
        return coffeeBeanse;
    }
}

enum Action {
    BUY, FILL, TAKE, REMAINING, EXIT
}

public class CoffeeMachine {
    static int water = 400;
    static int milk = 540;
    static int coffeeBeans = 120;
    static int disposableCups = 9;
    static int money = 550;

    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        String actionString = scanner.nextLine().toUpperCase();
        Action action;
        try {
            action = Action.valueOf(actionString);
        } catch (IllegalArgumentException ex) {
            action = Action.EXIT;
        }
        while (!action.equals(Action.EXIT)) {
            choosingAnAction(action);
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            //  if (scanner.hasNext()) scanner.next();
            //  scanner.next();
            actionString = scanner.nextLine().toUpperCase();
            try {
                action = Action.valueOf(actionString);
            } catch (IllegalArgumentException ex) {
                action = Action.EXIT;
            }
        }
    }

    static void choosingAnAction(Action action) {
        switch (action) {
            case BUY:
                buyMethod();
                break;
            case FILL:
                fillCoffeeMachine();
                break;
            case TAKE:
                takeMoneyFromCoffeeMachine();
                break;
            case REMAINING:
                printCoffeeMachineState();
                break;
            default:
                break;
        }

        //  printCoffeeMachineState();
    }

    static void buyMethod() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:  ");
        String select = scanner.nextLine().toUpperCase();
        switch (select) {
            case "1":
                checkProductInCoffeeMachine(CoffeeProduct.ESPRESSO);
                break;
            case "2":
                checkProductInCoffeeMachine(CoffeeProduct.LATTE);
                break;
            case "3":
                checkProductInCoffeeMachine(CoffeeProduct.CAPPUCCINO);
                break;
            default:
                System.out.println();
                break;
        }
    }

    private static void printCoffeeMachineState() {
        System.out.println("The coffee machine has:%n");
        System.out.printf("%d ml of water%n", water);
        System.out.printf("%d ml of milk%n", milk);
        System.out.printf("%d g of coffee beans%n", coffeeBeans);
        System.out.printf("%d disposable cups%n", disposableCups);
        System.out.printf("$%d of money;%n%n", money);
    }

    static void checkProductInCoffeeMachine(CoffeeProduct product) {
        if (disposableCups > 0) {
            if (water < product.getWater()) {
                System.out.println("Sorry, not enough water!");
            } else if (milk < product.getMilk()) {
                System.out.println("Sorry, not enough milk!");
            } else if (coffeeBeans < product.getCoffeeBeanse()) {
                System.out.println("Sorry, not enough coffee beans!");
            } else {
                disposableCups--;
                water -= product.getWater();
                milk -= product.getMilk();
                coffeeBeans -= product.getCoffeeBeanse();
                money += product.getPrice();
                System.out.println("I have enough resources, making you a coffee!\n");
            }
        } else {
            System.out.println("Sorry, not enough disposable cups!");
        }
    }

    static void fillCoffeeMachine() {
        System.out.println("Write how many ml of water you want to add: ");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add: ");
        coffeeBeans += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        disposableCups += scanner.nextInt();
        scanner.nextLine();
        System.out.println();
    }

    static void takeMoneyFromCoffeeMachine() {
        System.out.printf("I gave you $%d%n%n", money);
        money = 0;
    }
}