package com.cwoongc.study.design_pattern.decorator;

public class AComponent implements AlphabetComponent {
    @Override
    public void printAlphabetWhatYouWant() {
        System.out.printf("A");
    }
}
