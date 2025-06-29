//problem statement
//pizza -  base or deluxe pizza
//base - veg(300 rs) and non veg(400 rs)
//add on in base - extra cheese(100 rs)
//add on in base - extra topping(100 rs)
//base - take away(rs 20 for bag pack)
//user->order pizza->add on -> take away
//deluxe(already extra cheese and topping)
//deluxe - take away (rs 20)
class Pizza {
    private int price;
    private boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backPackPrice = 20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;

    Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
        if (!isExtraCheeseAdded) {
            isExtraCheeseAdded = true;
            System.out.println("Extra cheese added");
            this.price += extraCheesePrice;
        }
    }

    public void addExtraToppings() {
        if (!isExtraToppingsAdded) {
            isExtraToppingsAdded = true;
            System.out.println("Extra toppings added");
            this.price += extraToppingsPrice;
        }
    }

    public void takeAway() {
        if (!isOptedForTakeAway) {
            isOptedForTakeAway = true;
            System.out.println("Take away opted");
            this.price += backPackPrice;
        }
    }

    public void getBill() {
        String bill = "";
        bill += "Pizza: " + basePizzaPrice + "\n";
        if (isExtraCheeseAdded) {
            bill += "Extra cheese added: " + extraCheesePrice + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra toppings added: " + extraToppingsPrice + "\n";
        }
        if (isOptedForTakeAway) {
            bill += "Take away: " + backPackPrice + "\n";
        }
        bill += "Bill: " + this.price + "\n";
        System.out.println(bill);
    }
}

// Subclass
class DeluxPizza extends Pizza {
    DeluxPizza(boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    // Prevent further changes
    @Override
    public void addExtraCheese() {
        // Do nothing
    }

    @Override
    public void addExtraToppings() {
        // Do nothing
    }
}

// Main class
public class bill {
    public static void main(String[] args) {
        System.out.println("---- Base Pizza ----");
        Pizza basePizza = new Pizza(true);
        basePizza.addExtraToppings();
        basePizza.addExtraCheese();
        basePizza.takeAway();
        basePizza.getBill();

        System.out.println("---- Delux Pizza ----");
        DeluxPizza dp = new DeluxPizza(true);
        dp.getBill();
    }
}
