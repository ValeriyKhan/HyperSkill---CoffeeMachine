package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static int cashInMachine = 550;
    public static int waterInMachine = 400;
    public static int milkInMachine = 540;
    public static int beansInMachine = 120;
    public static int disposableCups = 9;

    public static void showMachineInfo() {
        System.out.println("The coffee machine has:");
        System.out.println(waterInMachine + " ml of water");
        System.out.println(milkInMachine + " ml of milk");
        System.out.println(beansInMachine + " g of coffee beans");
        System.out.println(disposableCups + " disposable cups");
        System.out.println("$" +cashInMachine + " of money");
    }

    public static void getAction() {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        switch (choice) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                String coffeeChoice = scanner.next();
                switch (coffeeChoice) {
                    case "1":
                        if (waterInMachine < 250) {
                            System.out.println("Machine cannot make a coffee because its hasn't water");
                        } else if (beansInMachine < 16) {
                            System.out.println("Machine cannot make a coffee because its hasn't coffee beans");
                        } else if (disposableCups < 1) {
                            System.out.println("Machine cannot make a coffee because its hasn't coffee disposable cups");
                        } else {
                            waterInMachine -= 250;
                            beansInMachine -= 16;
                            cashInMachine += 4;
                            disposableCups -= 1;
                            System.out.println("I have enough resources, making you a coffee!");
                        }
                        getAction();
                        break;
                    case "2":
                        if (waterInMachine < 300) {
                            System.out.println("Machine cannot make a coffee because its hasn't water");
                        } else if (milkInMachine < 75) {
                            System.out.println("Machine cannot make a coffee because its hasn't milk");
                        } else if (beansInMachine < 20) {
                            System.out.println("Machine cannot make a coffee because its hasn't coffee beans");
                        } else if (disposableCups < 1) {
                            System.out.println("Machine cannot make a coffee because its hasn't coffee disposable cups");
                        } else {
                            waterInMachine -= 350;
                            milkInMachine -= 75;
                            beansInMachine -= 20;
                            cashInMachine += 7;
                            disposableCups -= 1;
                            System.out.println("I have enough resources, making you a coffee!");
                        }
                        getAction();
                        break;
                    case "3":
                        if (waterInMachine < 200) {
                            System.out.println("Machine cannot make a coffee because its hasn't water");
                        } else if (milkInMachine < 100) {
                            System.out.println("Machine cannot make a coffee because its hasn't milk");
                        } else if (beansInMachine < 12) {
                            System.out.println("Machine cannot make a coffee because its hasn't coffee beans");
                        } else if (disposableCups < 1) {
                            System.out.println("Machine cannot make a coffee because its hasn't coffee disposable cups");
                        } else {
                            waterInMachine -= 200;
                            milkInMachine -= 100;
                            beansInMachine -= 12;
                            cashInMachine += 6;
                            disposableCups -= 1;
                            System.out.println("I have enough resources, making you a coffee!");
                        }
                        getAction();
                        break;
                    case "back":
                        getAction();
                        break;
                }
                break;
            case "take":
                System.out.println("I gave you $" + (cashInMachine = 0));
                getAction();
                break;
            case "fill":
                System.out.println("Write how many ml of water you want to add: ");
                waterInMachine += scanner.nextInt();
                milkInMachine += scanner.nextInt();
                beansInMachine += scanner.nextInt();
                disposableCups += scanner.nextInt();
                getAction();
                break;
            case "exit":
                break;
            case "remaining":
                showMachineInfo();
                getAction();
                break;
        }
    }

    public static void main(String[] args) {
        getAction();
    }


}
