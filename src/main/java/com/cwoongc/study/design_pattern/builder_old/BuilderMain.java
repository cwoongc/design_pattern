package com.cwoongc.study.design_pattern.builder_old;

public class BuilderMain {
    public static void main(String[] args) {
        Cook cook = new Cook();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        cook.setPizzaBuilder(hawaiianPizzaBuilder);
        cook.constructPizzaProduct();

        PizzaProduct pizza = cook.getPizzaProduct();
    }
}
