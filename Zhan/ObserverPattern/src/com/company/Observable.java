package com.company;

public interface Observable {
    void registerObserver(Observer observer);
    void unRegisterObserver(Observer observer);
    void notifyAllObservers();
}
