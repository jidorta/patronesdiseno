package com.example.builder.company.creational.builder;

public class PizzaBuilder {
    private String masa;
    private String salsa;
    private String relleno;

    public PizzaBuilder setMasa(String masa) {
        this.masa = masa;
        return this;
    }

    public PizzaBuilder setSalsa(String salsa) {
        this.salsa = salsa;
        return this;
    }

    public PizzaBuilder setRelleno(String relleno) {
        this.relleno = relleno;
        return this;
    }
    public Pizza build(){
        return new Pizza(masa, salsa, relleno);

    }
}
