package com.cwoongc.study.design_pattern.decorator;

public class DecoratorClient {

    AlphabetComponent component;

    public DecoratorClient(AlphabetComponent component) {
        this.component = component;
    }

    public void doWhatClientWants() {
        component.printAlphabetWhatYouWant();
    }




}
