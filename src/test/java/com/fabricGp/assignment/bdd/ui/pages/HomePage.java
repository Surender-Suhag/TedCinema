package com.fabricGp.assignment.bdd.ui.pages;

import com.fabricGp.assignment.bdd.services.HomePgServices;

//@Component
//@Scope("prototype")
public class HomePage extends BasePage implements HomePgServices {



    @Override
    public void openLoginPage(){
        System.out.println("Login page opened");
    }

    @Override
    public void openMovieInfoPage() {

    }

    @Override
    public void openLink(String link) {
        if(link.toLowerCase().contains("log in"))
            System.out.println("Opening Login page");
    }
}
