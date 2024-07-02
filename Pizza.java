import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;

public class Pizza{

    //variable for base price of pizza
    private int price;
    private Boolean veg;
    private int extraCheesePrice = 70;
    private int extraToppingPrice = 140;
    private int backPackPrice = 20;
    private int basePizzaPrice;

    private boolean isExtraCheesAdded = false;
    private boolean isExtraToppingAdded = false;
    private boolean isOpptedForTakeAway = false;

    //constructor
    public Pizza(Boolean veg){
        this.veg =veg;

        if (this.veg){
            this.price = 220;
        }else{
            this.price = 270;
        }
        basePizzaPrice = this.price;
    }

    //methods
    // 1)for extra cheese
    public void addExtraCheese(){
        isExtraCheesAdded = true;
        //System.out.println("Extra Cheese added!");
        this.price += extraCheesePrice;
    }

    // 2)for extra topping
    public void addExtraTopping(){
        isExtraToppingAdded = true;
        //System.out.println("Extra Topping added!");
        this.price += extraToppingPrice;
    }

    // 3)for takeaway
    public void takeAway(){
        isOpptedForTakeAway = true;
        //System.out.println("Take Away opted");
        this.price += backPackPrice;
    }

    // 4)for get bill
    public void getBill(){
        //System.out.println("The total price of Pizza is: " + this.price);

        String Totalbill = "";
        System.out.println("Base Pizza: " + basePizzaPrice);

        if(isExtraCheesAdded){
            Totalbill += "Extra Cheese Added: "+ extraCheesePrice + "\n";
        }
        if(isExtraToppingAdded){
            Totalbill += "Extra Toppings Added: "+ extraToppingPrice + "\n";
        }
        if(isOpptedForTakeAway){
            Totalbill += "Opted for take away: "+ backPackPrice + "\n";
        }

        //total price
        Totalbill += "Total Bill: "+ this.price + "\n";
        System.out.println(Totalbill);
    }

    //delux pizza class
    public static class deluxPizza extends Pizza{
        
        //constructor
        public deluxPizza(boolean veg){
            super(veg);
            super.addExtraCheese();
            super.addExtraTopping();

        }
    }


    //main method
    public static void main(String args[]){
         Pizza basePizza = new Pizza(false);
         basePizza.addExtraTopping();
         basePizza.takeAway();
         basePizza.getBill();

       

        //deluxPizza dp = new deluxPizza(true);
        //dp.getBill();
        
    }  
}

