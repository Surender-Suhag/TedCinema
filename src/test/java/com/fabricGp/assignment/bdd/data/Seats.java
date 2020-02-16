package com.fabricGp.assignment.bdd.data;

import org.springframework.stereotype.Component;

@Component
public class Seats {

    private static final int ROW_COUNT=10;
    private static final int SEATS_IN_ROW=5;
    private static final double PRICE_PER_SEAT=15;

    private  final boolean[][] SEATS = new boolean[ROW_COUNT][SEATS_IN_ROW];


    public Seats(){
        for(int i=0;i<ROW_COUNT;i++)
            for (int j=0;j<SEATS_IN_ROW;j++)
                SEATS[i][j] = false;
    }

    public boolean ifSeatIsAvailable(int row,int colmn){
        return SEATS[row][colmn];
    }
    public void bookSeat(int row,int column){
        SEATS[row][column] = false;
    }

    public void bookSeat(){
        for(int i=0;i<ROW_COUNT;i++) {
            for (int j = 0; j < SEATS_IN_ROW; j++) {
                if(SEATS[i][j]){
                    SEATS[i][j]=false;
                    return;
                }
            }
        }
    }

    public static double getPricePerSeat() {
        return PRICE_PER_SEAT;
    }
}
