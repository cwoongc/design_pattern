package com.cwoongc.study.design_pattern.adapter.object_adapter;

public class ObjectAdapterMain {

    public static void main(String[] args) {

        Client client = new Client(new Adapter(new Adaptee()));

        client.doClientJob2();

    }
}
