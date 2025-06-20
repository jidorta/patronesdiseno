package com.example.builder.company.creational.builder;

public class Pizza {

    private String masa;
    private String salsa;
    private String relleno;

    public Pizza(String masa, String salsa, String relleno) {
        this.masa = masa;
        this.salsa = salsa;
        this.relleno = relleno;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "masa='" + masa + '\'' +
                ", salsa='" + salsa + '\'' +
                ", relleno='" + relleno + '\'' +
                '}';
    }
}





