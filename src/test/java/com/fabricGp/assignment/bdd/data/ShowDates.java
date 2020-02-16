package com.fabricGp.assignment.bdd.data;



import java.time.*;
public class ShowDates {

    public static LocalDate getNextNonTuesdayDate(){
        LocalDate date = LocalDate.now();
        while (date.getDayOfWeek() == DayOfWeek.TUESDAY){
            date = date.plusDays(1);
        }

        return date;
    }

    public static LocalDate getNextTuesdayDate(){
        LocalDate date = LocalDate.now();
        while (date.getDayOfWeek() != DayOfWeek.TUESDAY){
            date = date.plusDays(1);
        }

        return date;
    }
}
