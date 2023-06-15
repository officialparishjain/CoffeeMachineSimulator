import java.util.Scanner;

public class CoffeeMachineSimulator {

    private int water;
    private int beans;
    private int milk;
    private int espressoCount;
    private int latteCount;
    private int cappuccinoCount;
    private int totalEarned;


    // Price in Dollars
    private int espressoPrice = 4;
    private int lattePrice = 7;
    private int cappuccinoPrice = 6;

    // Water in ml
    private int espressoWater = 250;
    private int latteWater = 350;
    private int cappuccinoWater = 200;


    // Milk in ml
    private int espressoMilk = 0;
    private int latteMilk = 75;
    private int cappuccinoMilk = 100;

    // Beans in units
    private int espressoBeans = 16;
    private int latteBeans = 20;
    private int cappuccinoBeans = 12;

    public CoffeeMachineSimulator(){
        this.water = 0;
        this.beans = 0;
        this.milk = 0;
        this.espressoCount = 0;
        this.cappuccinoCount = 0;
        this.latteCount = 0;
        this.totalEarned = 0;
    }

    protected void fillIngredients(Scanner sc) {
        System.out.println("-----------------------------------------------");
        System.out.println("              FILL INGREDIENTS                 ");
        System.out.println("-----------------------------------------------");
        System.out.println("Enter the amount of water to add:");
        water += sc.nextInt();
        System.out.println("Enter the amount of milk to add:");
        milk += sc.nextInt();
        System.out.println("Enter the amount of beans to add:");
        beans += sc.nextInt();
        sc.nextLine();
    }

    protected void showIngredients() {
        System.out.println("-----------------------------------------------");
        System.out.println("              STATUS OF INGREDIENTS            ");
        System.out.println("-----------------------------------------------");
        System.out.println("Water: " + water + " ml");
        System.out.println("Milk: " + milk + " ml");
        System.out.println("Beans: " + beans + " grams");
    }

    protected void showAnalytics(){
        System.out.println("-----------------------------------------------");
        System.out.println("              ANALYTICS OF MACHINE             ");
        System.out.println("-----------------------------------------------");
        System.out.println("Espresso sold: " + espressoCount);
        System.out.println("Latte sold: " + latteCount);
        System.out.println("Cappuccino sold: " + cappuccinoCount);
        System.out.println("Total amount earned: $" + totalEarned);
    }

    protected void buyCoffee(Scanner sc){
        System.out.println("-----------------------------------------------");
        System.out.println("                    BUY COFFEE                 ");
        System.out.println("-----------------------------------------------");
        System.out.println("1. Espresso ");
        System.out.println("2. Cappuccino ");
        System.out.println("3. Latte ");
        System.out.println("4. Discard ");
        System.out.println("Enter the choice : ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice){
            case 1:
                if(checkIngredients(espressoWater,espressoMilk,espressoBeans)){
                    beans-=espressoBeans;
                    water-=espressoWater;
                    milk-=espressoMilk;
                    totalEarned+=espressoPrice;
                    espressoCount++;
                    System.out.println("\nYour Espresso is Ready.");
                    System.out.println("Thanks for buying Coffee....🍵🍵🍵🍵🍵🍵");
                    System.out.println("Have a nice day...");
                }
                else {
                    System.out.println("Ingredients are not enough to make Espresso ...");
                    System.out.println("Kindly fill the Ingredients ... ");
                }
                break;
            case 2:
                if(checkIngredients(cappuccinoWater,cappuccinoMilk,cappuccinoBeans)){
                    beans-=cappuccinoBeans;
                    water-=cappuccinoWater;
                    milk-=cappuccinoMilk;
                    totalEarned+=cappuccinoPrice;
                    cappuccinoCount++;
                    System.out.println("\nYour Cappuccino is Ready.");
                    System.out.println("Thanks for buying Coffee....🍵🍵🍵🍵🍵🍵");
                    System.out.println("Have a nice day...");
                }
                else {
                    System.out.println("Ingredients are not enough to make Cappuccino ...");
                    System.out.println("Kindly fill the Ingredients ... ");
                }
                break;

            case 3:
                if(checkIngredients(latteWater,latteMilk,latteBeans)){
                    beans-=latteBeans;
                    water-=latteWater;
                    milk-=latteMilk;
                    totalEarned+=lattePrice;
                    latteCount++;
                    System.out.println("\nYour Latte is Ready.");
                    System.out.println("Thanks for buying Coffee....🍵🍵🍵🍵🍵🍵");
                    System.out.println("Have a nice day...");
                }
                else {
                    System.out.println("Ingredients are not enough to make Latte ...");
                    System.out.println("Kindly fill the Ingredients ... ");
                }
                break;
            case 4:
                return;
        }
    }

    private boolean checkIngredients(int waterNeeded, int milkNeeded, int beansNeeded) {
        if(water >= waterNeeded && beans >= beansNeeded && milk >= milkNeeded) return true;
        else return false;
    }
}
