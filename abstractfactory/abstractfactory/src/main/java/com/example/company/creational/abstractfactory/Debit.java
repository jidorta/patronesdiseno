package com.example.company.creational.abstractfactory;

public class Debit implements  PaymentMethod{
    @Override
    public String doPayment() {
        return "Pago a Débito";
    }
}
