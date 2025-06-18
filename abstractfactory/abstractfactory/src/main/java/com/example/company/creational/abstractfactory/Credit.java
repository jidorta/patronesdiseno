package com.example.company.creational.abstractfactory;

public class Credit implements PaymentMethod{
    @Override
    public String doPayment() {
        return "Pago a Crédito";
    }
}
