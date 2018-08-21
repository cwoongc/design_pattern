package com.cwoongc.study.design_pattern.builder_old;

/** "Director" */
public class Cook {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public PizzaProduct getPizzaProduct() {
        return pizzaBuilder.getPizzaProduct();
    }

    public void constructPizzaProduct() {
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
}
