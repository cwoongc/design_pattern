package com.cwoongc.study.design_pattern.decorator;

public abstract class AlphabetComponentDecorator implements AlphabetComponent {

    protected final AlphabetComponent component;

    /**
     * Added Behavior
     */
    protected abstract void printDecoratingAlpabet();


    protected AlphabetComponentDecorator(AlphabetComponent component) {
        this.component = component;
    }


}
