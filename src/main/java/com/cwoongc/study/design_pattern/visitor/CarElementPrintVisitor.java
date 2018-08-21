package com.cwoongc.study.design_pattern.visitor;

public class CarElementPrintVisitor implements CarElementVisitor {
    @Override
    public void visit(Wheel wheel) {
        System.out.println(wheel.getName());
    }

    @Override
    public void visit(Engine engine) {
        System.out.println(engine.getName());
    }

    @Override
    public void visit(Body body) {
        System.out.println(body.getName());
    }
}
