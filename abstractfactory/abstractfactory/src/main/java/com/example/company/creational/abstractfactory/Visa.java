package com.example.company.creational.abstractfactory;

public class Visa implements Card{
    @Override
    public String getCardType() {
        return "VISA";
    }

    @Override
    public String getCardNumber() {
        return "0000 000 000 VISA";
    }
}
