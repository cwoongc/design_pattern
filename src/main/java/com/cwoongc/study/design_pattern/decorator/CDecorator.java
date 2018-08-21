package com.cwoongc.study.design_pattern.decorator;

public class CDecorator extends AlphabetComponentDecorator {


    public CDecorator(AlphabetComponent component) {
        super(component);
    }

    /**
     * Added Behavior
     */
    @Override
    protected void printDecoratingAlpabet() {
        System.out.printf("C");
    }

    /**
     * component operation
     */
    @Override
    public void printAlphabetWhatYouWant() {
        component.printAlphabetWhatYouWant();
        printDecoratingAlpabet();

    }
}
