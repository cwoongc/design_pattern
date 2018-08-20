package com.cwoongc.study.design_pattern.adapter.class_adapter;

public class ClassAdapterMain {

    public static void main(String[] args) {

        Client client = new Client(new Adapter());

        client.doClientJob1();



    }
}
