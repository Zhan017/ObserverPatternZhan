package com.company;

import java.util.ArrayList;
import java.util.List;

public class PremierLeague implements Observable {

    List<String> results = new ArrayList<>();
    List<Observer> observers = new ArrayList<>();

    public void addResult(String result){
        this.results.add(result);
        notifyAllObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
    this.observers.add(observer);
    }

    @Override
    public void unRegisterObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer: observers){
            observer.update(this.results);
        }
    }
}
