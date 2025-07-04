package com.example.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewAgency implements  Subject{
    public NewAgency() {
    }

    private List<Observer>observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
       observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
            observers.stream()
                    .forEach(observer -> observer.update(message));
    }
}
