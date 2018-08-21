package com.cwoongc.study.design_pattern.builder_old;

/** "Abstract Builder" */
public abstract class PizzaBuilder {

    protected PizzaProduct pizzaProduct;

    public PizzaProduct getPizzaProduct() {
        return this.pizzaProduct;
    }

    public void createNewPizzaProduct() {
        pizzaProduct = new PizzaProduct();
    }

    public abstract void buildDough();

    public abstract void buildSauce();

    public abstract void buildTopping();

}
