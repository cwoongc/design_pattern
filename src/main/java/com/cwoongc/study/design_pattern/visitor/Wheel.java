package com.cwoongc.study.design_pattern.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Wheel implements CarElement{

    private String name;

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
