package com.cwoongc.study.design_pattern.visitor;

public interface CarElement {

    void accept(CarElementVisitor visitor);
}
