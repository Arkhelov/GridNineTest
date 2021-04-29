package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class ErlierThanNow {

    public static List<Flight> filter(List<Flight> flights) {
        List<Flight> filteredEarlierNow = new LinkedList();
        for (Flight flight : flights) {
            if (flight.getSegments().get(0).getDepartureDate().isAfter(LocalDateTime.now())) {
                filteredEarlierNow.add(flight);
            }

        }
        return filteredEarlierNow;
    }
}