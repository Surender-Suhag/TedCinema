package com.fabricGp.assignment.bdd.services;

import org.springframework.stereotype.Component;

@Component
public interface HomePgServices {
    void openLoginPage();
    void openMovieInfoPage();

    void openLink(String link);
}
