package com.munozrc.todo;

import java.util.ArrayList;

public abstract class Observable {

    private final ArrayList<Observer> listObservers = new ArrayList<>();

    public void attach(Observer observer) {
        this.listObservers.add(observer);
    }

    public void detach(Observer observer) {
        this.listObservers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : this.listObservers) {
            observer.update();
        }
    }

}
