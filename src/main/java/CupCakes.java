import interfaces.DietaryRequirements;

public class CupCakes extends Cake implements DietaryRequirements {

    private String toppings;
    private int quantity;

    private String dietaryRequirements;


    public CupCakes(String name, String baseFlavour, String topping, String dietaryRequirements) {
        super(name, baseFlavour);
        this.toppings = topping;
        this.quantity = 0;
        this.dietaryRequirements = dietaryRequirements;
    }


    public String getToppings(){
        return toppings;
    }

    public void setToppings(String newToppings){
        this.toppings = newToppings;
    }

    @Override
    public String decorate(){
        return "Floral themed";
    }

    public String getDietaryRequirements(){
        return dietaryRequirements;
    }
}
