package com.cwoongc.study.design_pattern.builder_old;

/** "ConcreteBuilder" */
public class HawaiianPizzaBuilder extends PizzaBuilder {
    @Override
    public void buildDough() {
        pizzaProduct.setDough("cross");
    }

    @Override
    public void buildSauce() {
        pizzaProduct.setSauce("mild");
    }

    @Override
    public void buildTopping() {
        pizzaProduct.setTopping("ham+pineapple");
    }


}
