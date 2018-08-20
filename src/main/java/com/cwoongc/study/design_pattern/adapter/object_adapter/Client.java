package com.cwoongc.study.design_pattern.adapter.object_adapter;

public class Client {

    private ClientInterface clientInterface;

    public Client(ClientInterface clientInterface) {
        this.clientInterface = clientInterface;
    }

    public void doClientJob2() {
        this.clientInterface.doB();
    }
}
