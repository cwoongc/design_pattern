package com.cwoongc.study.design_pattern.builder_old;

/** "ConcreteBuilder" */
public class SpicyPizzaBuilder extends PizzaBuilder {
    @Override
    public void buildDough() {
        pizzaProduct.setDough("pan baked");
    }

    @Override
    public void buildSauce() {
        pizzaProduct.setSauce("hot");
    }

    @Override
    public void buildTopping() {
        pizzaProduct.setTopping("pepperoni+salami");
    }
}
