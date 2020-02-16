package com.fabricGp.assignment.bdd.ui.pages;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class ShowSelectionPage extends BasePage {


    public void selectShowDate(LocalDate date){
        System.out.println("Show selected for date -- " + date);
    }

    public void selectFirstShow(){
        this.selectShowForDate(1);
    }

    public void selectShowForDate(int showNo){
        System.out.println(String.format("Show number [%d] is selected",showNo ));
    }
}
