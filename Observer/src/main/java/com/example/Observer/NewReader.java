package com.example.Observer;

public class NewReader implements Observer{
    private String name;

    public NewReader(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received news: " + message);
    }
}
