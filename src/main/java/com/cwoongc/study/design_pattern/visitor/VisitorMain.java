package com.cwoongc.study.design_pattern.visitor;

public class VisitorMain {

    public static void main(String[] args) {

        CarElement[] elements = new CarElement[] {
          new Body("body"),
          new Engine("engine"),
          new Wheel("wheel")
        };


        CarElementVisitor visitor = new CarElementPrintVisitor();

        ClientCollection clientCollection = new ClientCollection(elements, visitor);

        clientCollection.accept();


    }
}
