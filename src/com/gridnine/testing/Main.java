package com.gridnine.testing;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> flights = FlightBuilder.createFlights();

        //Накладывать фильтры можно по отдельности
        System.out.println(ArrivalAfterDepartured.filter(TimeMore2Hour.filter(ErlierThanNow.filter(flights))));

    }
}
