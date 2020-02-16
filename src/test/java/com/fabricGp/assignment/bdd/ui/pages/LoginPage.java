package com.fabricGp.assignment.bdd.ui.pages;

import com.fabricGp.assignment.bdd.data.User;
import com.fabricGp.assignment.bdd.services.LoginPgServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class LoginPage implements LoginPgServices {

    @Autowired
    @Qualifier("tedUser")
    private User tedUser;

    @Override
    public void loginValidNonTedUser() {
        System.out.println("Login valid Non-Ted User");
    }

    @Override
    public void loginValidTedUser() {
        System.out.println("Login valid Ted User");

    }

    @Override
    public void loginInvalidUser() {
        System.out.println("Login invalid User");

    }

    @Override
    public void validateLoginErrorMeg() {
        System.out.println("validate user is not logged in");
    }

    @Override
    public void openMovieInfoPage() {
        System.out.println("Open Movie Info page");
    }


}
