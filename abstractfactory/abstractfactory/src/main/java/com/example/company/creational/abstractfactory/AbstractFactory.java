package com.example.company.creational.abstractfactory;

public interface AbstractFactory<T> {
    T create(String type);
}
