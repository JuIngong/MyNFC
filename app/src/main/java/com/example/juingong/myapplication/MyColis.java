package com.example.juingong.myapplication;

/**
 * Created by JuIngong on 01/04/2018.
 */

public class MyColis {
    Colis colis;

    Client client;

    public MyColis(Colis colis, Client client) {
        this.colis = colis;
        this.client = client;
    }
    public MyColis(Colis colis) {
        this.colis = colis;
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

    @Override
    public String toString() {
        return "MyColis{" +
                "colis=" + colis +
                ", client=" + client +
                '}';
    }
}
