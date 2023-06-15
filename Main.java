import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        CoffeeMachineSimulator simulator = new CoffeeMachineSimulator();
        System.out.println("☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕");
        System.out.println("                        Made by : Parish Jain                   ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("|                         Coffee Machine                        |");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕");

        while(true){
            System.out.println();
            System.out.println("Select an action .....");
            System.out.println("\n-------------------------------- ");
            System.out.println("|1:          Buy Coffee         |");
            System.out.println("-------------------------------- \n|2:      Fill Ingredients       |");
            System.out.println("-------------------------------- \n|3:       Clean Machine         |");
            System.out.println("-------------------------------- \n|4:   Check Ingredient Status   |");
            System.out.println("-------------------------------- \n|5:    Coffee Sales Analytics   |");
            System.out.println("-------------------------------- \n|6:             Exit            |");
            System.out.println("-------------------------------- \n");
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    simulator.buyCoffee(sc);
                    System.out.println("Making Coffee");
                    break;
                case 2:
                    simulator.fillIngredients(sc);
                    break;
                case 3:
                    System.out.println("Machine Cleaned");
                    break;
                case 4:
                    simulator.showIngredients();
                    break;
                case 5:
                    simulator.showAnalytics();
                    break;
                case 6:
                    System.out.println("Exiting from the coffee Machine");
                    return;
                default:
                    System.out.println("Invalid action! Please try again.");
            }
        }
    }
}
