package com.cwoongc.study.design_pattern.adapter.class_adapter;

public class Client {

    private ClientInterface clientInterface;


    /**
     * Adapter Instance DI
     * @param clientInterface
     */
    public Client(ClientInterface clientInterface) {
        this.clientInterface = clientInterface;
    }


    public void doClientJob1() {
        clientInterface.doA();
    }



}
