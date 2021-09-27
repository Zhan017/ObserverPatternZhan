package com.company;

import java.util.List;

public class User implements Observer{
    private String login;

    public User(String login) {
        this.login = login;
    }

    @Override
    public void update(List<String> results){
        System.out.println("Hey " + login + ", The final result of last match is " + results);
    }
}
