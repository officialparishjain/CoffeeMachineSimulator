
![Black Technology LinkedIn Banner (4)](https://github.com/officialparishjain/CoffeeMachineSimulator/assets/124424043/fee9f40c-f971-4a84-93c3-3473c37980df)


# Coffee Machine Simulator

This program is a coffee machine simulator that allows users to perform various actions such as buying coffee, filling ingredients, cleaning the machine, checking ingredient status, and viewing coffee sales analytics. The simulator keeps track of the ingredients, coffee sales, and total earnings.

## Usage

1. Run the `Main` class to start the program.
2. The program will display the coffee machine options menu.
3. Choose an action by entering the corresponding number.
4. Follow the prompts and provide input as needed.
5. The program will execute the selected action and display the results or messages accordingly.
6. Repeat the process for different actions or exit the program.

## Actions

1. **Buy Coffee**: Allows the user to buy coffee by selecting a coffee type (Espresso, Cappuccino, or Latte).
2. **Fill Ingredients**: Enables the user to fill the coffee machine with water, milk, and beans.
3. **Clean Machine**: Cleans the coffee machine.
4. **Check Ingredient Status**: Displays the current status of the ingredients (water, milk, and beans).
5. **Coffee Sales Analytics**: Shows the statistics of coffee sales, including the number of each type of coffee sold and the total earnings.
6. **Exit**: Exits the coffee machine simulator.


## Classes

The Coffee Machine Simulator consists of two main classes:

### 1. `Main`

The `Main` class serves as the entry point of the program. It provides the main menu and handles user input. This class interacts with the `CoffeeMachineSimulator` class to perform various coffee machine actions.

#### Main Class Methods

- The main method that initializes the coffee machine simulator and displays the main menu. It continuously prompts the user for an action choice and invokes the corresponding method in the `CoffeeMachineSimulator` class.

### 2. `CoffeeMachineSimulator`

The `CoffeeMachineSimulator` class implements the coffee machine logic. It manages the ingredients, performs the coffee machine actions, and keeps track of coffee sales analytics.

#### CoffeeMachineSimulator Class Properties

- `water`: The amount of water in milliliters.
- `beans`: The amount of coffee beans in grams.
- `milk`: The amount of milk in milliliters.
- `espressoCount`: The number of espresso coffees sold.
- `latteCount`: The number of latte coffees sold.
- `cappuccinoCount`: The number of cappuccino coffees sold.
- `totalEarned`: The total earnings in dollars.

#### CoffeeMachineSimulator Class Methods

- `fillIngredients(Scanner sc)`: Prompts the user to enter the quantity of water, milk, and beans to add to the coffee machine. Updates the ingredient inventory accordingly.
- `showIngredients()`: Displays the current status of the ingredients (water, milk, and beans).
- `showAnalytics()`: Shows the coffee sales analytics, including the number of each coffee type sold and the total earnings.
- `buyCoffee(Scanner sc)`: Allows the user to buy coffee by selecting a coffee type (Espresso, Cappuccino, or Latte). Checks the availability of ingredients and deducts the required amounts from the inventory. Updates the coffee sales and total earnings accordingly.
- `checkIngredients(int waterNeeded, int milkNeeded, int beansNeeded)`: Checks if there are enough ingredients available to make a particular type of coffee.

#### CoffeeMachineSimulator Class Constants

- `espressoPrice`: The price of an Espresso coffee in dollars.
- `lattePrice`: The price of a Latte coffee in dollars.
- `cappuccinoPrice`: The price of a Cappuccino coffee in dollars.
- `espressoWater`: The amount of water required to make an Espresso coffee in milliliters.
- `latteWater`: The amount of water required to make a Latte coffee in milliliters.
- `cappuccinoWater`: The amount of water required to make a Cappuccino coffee in milliliters.
- `espressoMilk`: The amount of milk required to make an Espresso coffee in milliliters.
- `latteMilk`: The amount of milk required to make a Latte coffee in milliliters.
- `cappuccinoMilk`: The amount of milk required to make a Cappuccino coffee in milliliters.
- `espressoBeans`: The amount of coffee beans required to make an Espresso coffee in grams.
- `latteBeans`: The amount of coffee beans required to make a Latte coffee in grams.
- `cappuccinoBeans`: The amount of coffee beans required to make a Cappuccino coffee in grams.

## Steps wise Step Explanation

- Step 1: Run the program and select the action to perform
 ![image](https://github.com/officialparishjain/CoffeeMachineSimulator/assets/124424043/9eadf8e7-8f00-4b69-b6f6-8fda95b1e9f6)
- Step 2: Fill the Ingredients
- ![image](https://github.com/officialparishjain/CoffeeMachineSimulator/assets/124424043/927511d0-6058-41a1-b514-e31535a0a507)
- Step 3: Buy the coffee  select between options (1-Espresso , 2- Cappuccino, 3-Latte)
- ![image](https://github.com/officialparishjain/CoffeeMachineSimulator/assets/124424043/22138e09-cfd1-403b-aac8-88216545a73e)
- Step 4: Check Sales Analytics and Money Collected
- ![image](https://github.com/officialparishjain/CoffeeMachineSimulator/assets/124424043/8241d660-fead-4825-8c2a-e8ffe016ab26)
- Step 5: Ingredients Details
- ![image](https://github.com/officialparishjain/CoffeeMachineSimulator/assets/124424043/b03135b5-00a0-4b6f-af8e-0b7a84aeed4b)





## Authors

- Name: Parish Jain
- Contact: officialparishjain@gmail.com

---

Feel free to customize the content and styling of the README according to your preferences. You can also add additional sections or images as needed.
