package com.example.juingong.myapplication;

/**
 * Created by JuIngong on 01/04/2018.
 */

public class MyColis {
    Colis colis;
    String key;
    Client client;

    public MyColis(Colis colis, Client client, String key) {
        this.colis = colis;
        this.client = client;
        this.key = key;
    }

    public Colis getColis() {
        return colis;
    }

    public void setColis(Colis colis) {
        this.colis = colis;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "MyColis{" +
                "colis=" + colis +
                ", client=" + client +
                '}';
    }
}
