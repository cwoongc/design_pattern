package com.cwoongc.study.design_pattern.decorator;

public class BDecorator extends AlphabetComponentDecorator {


    public BDecorator(AlphabetComponent component) {
        super(component);
    }


    /**
     * Added Behavior
     */
    @Override
    protected void printDecoratingAlpabet() {
        System.out.printf("B");
    }

    @Override
    public void printAlphabetWhatYouWant() {
        component.printAlphabetWhatYouWant();
        printDecoratingAlpabet();
    }
}
