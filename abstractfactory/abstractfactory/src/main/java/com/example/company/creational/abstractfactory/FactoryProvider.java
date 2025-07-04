package com.example.company.creational.abstractfactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String chooseFactory){
        if ("Card".equals(chooseFactory)){
            return new CardFactory();
        }else if("PaymentMethod".equals(chooseFactory)){
            return new PaymentMethodFactory();
        }
        return null;
    }
}
