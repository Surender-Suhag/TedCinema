package com.fabricGp.assignment.bdd.stepdefs;

import com.fabricGp.assignment.bdd.services.ShowSelectionServices;
import io.cucumber.java8.En;
import org.springframework.beans.factory.annotation.Autowired;

public class MovieSelectionSteps implements En {

    @Autowired
    public MovieSelectionSteps(ShowSelectionServices showSelect) {
        When("I book a show with show date a {word}", (String weekDay) -> {
            if(weekDay.equalsIgnoreCase("non-Tuesday"))
                showSelect.selectNonTuesdayShow();
            else
                showSelect.selectNextTuesdayShow();
        });
    }
}
