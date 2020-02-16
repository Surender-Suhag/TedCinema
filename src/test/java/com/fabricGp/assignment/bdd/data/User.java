package com.fabricGp.assignment.bdd.data;

import org.springframework.stereotype.Component;

@Component
public class User {

    private String userName;
    private String password;

    private int pastMovieCount=0;

    public int getPastMovieCount() {
        return pastMovieCount;
    }

    public void setPastMovieCount(int pastMovieCount) {
        System.out.println("Setting past movie count to " + pastMovieCount);
        this.pastMovieCount = pastMovieCount;
    }


    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
