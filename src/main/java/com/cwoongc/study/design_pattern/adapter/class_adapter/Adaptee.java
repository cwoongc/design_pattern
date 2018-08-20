package com.cwoongc.study.design_pattern.adapter.class_adapter;


/**
 * Adaptee는 Client에게 목적 기능을 제공헐 수 있는 legacy 소스.
 * Client는 Adaptee의 메소드 시그니처와 다른 ClientInterface를 사용하고 있음.
 *
 * Adaptee(레가시 클래스)를 사용하여 Client의 목적기능을 제공하는
 * Client의 Interface를 구현하는 Adapter를 구현하는것이 목적.
 *
 */
public class Adaptee {

    public void doA1() {
        System.out.println("A1");
    }

}
