package com.fabricGp.assignment.bdd.helper;

import com.fabricGp.assignment.bdd.data.ShowDates;
import com.fabricGp.assignment.bdd.services.ShowSelectionServices;
import com.fabricGp.assignment.bdd.ui.pages.ShowSelectionPage;
import org.springframework.beans.factory.annotation.Autowired;

public class DefaultShowSelection implements ShowSelectionServices {

    private ShowSelectionPage showSelectionPage;

    @Autowired
    public void setShowSelectionPage(ShowSelectionPage showSelectionPage) {
        this.showSelectionPage = showSelectionPage;
    }
    
    @Override
    public void selectNextTuesdayShow(){
        showSelectionPage.selectShowDate(ShowDates.getNextTuesdayDate());
        showSelectionPage.selectFirstShow();
    }

    @Override
    public void selectNonTuesdayShow(){
        showSelectionPage.selectShowDate(ShowDates.getNextNonTuesdayDate());
        showSelectionPage.selectFirstShow();
    }
}
