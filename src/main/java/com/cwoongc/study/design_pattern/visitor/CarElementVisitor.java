package com.cwoongc.study.design_pattern.visitor;

public interface CarElementVisitor {

        void visit(Wheel wheel);
        void visit(Engine engine);
        void visit(Body body);

}
