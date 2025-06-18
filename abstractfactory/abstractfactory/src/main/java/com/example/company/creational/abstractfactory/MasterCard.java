package com.example.company.creational.abstractfactory;

public class MasterCard implements Card {
    @Override
    public String getCardType() {
        return "MASTERCARD";
    }

    @Override
    public String getCardNumber() {
        return "000 0000 000 MASTER CARD";
    }
}
