package com.fabricGp.assignment.bdd.stepdefs;

import com.fabricGp.assignment.bdd.services.HomePgServices;
import io.cucumber.java8.En;
import org.springframework.beans.factory.annotation.Autowired;

public class HomePageSteps implements En {

    @Autowired
    public HomePageSteps(HomePgServices homePg){
        Given("user chooses to book tickets without login",()->{
           homePg.openMovieInfoPage();
        });
    }
}
