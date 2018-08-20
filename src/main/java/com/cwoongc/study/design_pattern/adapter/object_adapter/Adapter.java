package com.cwoongc.study.design_pattern.adapter.object_adapter;

/**
 * Object Adapter는
 *  1. Client가 요구하는 ClientInteface를 구현하고
 *  2. Adaptee를 aggregation으로 사용하여 Client가 요구하는 기능을 만족시킨다.
 *
 */
public class Adapter implements ClientInterface{

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void doB() {
        this.adaptee.doB1();
    }
}
