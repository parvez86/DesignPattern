import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Sandwich{
    private  String bread;
    private String meat;
    private String cheese;
    private List<String> vegetables = new ArrayList<>();

    private Sandwich(){}

    public Sandwich setBread(String bread){
        this.bread = bread;
        return this;
    }

    public Sandwich setMeat(String meat){
        this.meat = meat;
        return this;
    }

    public Sandwich setCheese(String cheese){
        this.cheese = cheese;
        return this;
    }

    public Sandwich addVegetables(String vegetable){
        this.vegetables.add(vegetable);
        return this;
    }

    public static Sandwich make(Consumer<Sandwich> sandwichConsumer){
        Sandwich sandwich = new Sandwich();
        sandwichConsumer.accept(sandwich);
        return sandwich;
    }

    public void eat(){
        System.out.println("Eating sandwich: ");
        System.out.println("Bread - "+this.bread);
        System.out.println("Meat - "+this.meat);
        System.out.println("Cheese - "+this.cheese);
        System.out.println("Vegetables - "+ this.vegetables);
    }
}

public class fluentProgramming {
    public static void main(String[] args) {
        System.out.println("Making a sandwich.....");
        Sandwich sandwich = Sandwich.make( sandwich1 ->
                sandwich1.setBread("White")
                        .setMeat("Beef")
                        .setCheese("Cheddar")
                        .addVegetables("Tomato")
                        .addVegetables("Cucumber")
        );
        sandwich.eat();
    }
}
