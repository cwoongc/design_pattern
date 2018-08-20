package com.cwoongc.study.design_pattern.adapter.class_adapter;

/**
 * class adapter는
 *  1. Client가 요구하는 ClientInteface를 구현하고
 *  2. Adaptee를 상속으로 기능을 상속하여 Client가 요구하는 기능을 제공한다.
 */
public class Adapter extends Adaptee implements ClientInterface {
    @Override
    public void doA() {
       super.doA1(); //상속받은 adaptee의 기능으로 ClientInterface의 요구기능을 만족시킴
    }
}
