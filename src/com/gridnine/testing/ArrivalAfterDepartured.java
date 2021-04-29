package com.gridnine.testing;

import java.util.LinkedList;
import java.util.List;

public class ArrivalAfterDepartured {
    public static List<Flight> filter (List<Flight> flights){
        List<Flight> arriveAfterDeparture = new LinkedList();

        for(Flight flight : flights) {
            boolean ex = false;
            for (Segment segm : flight.getSegments()) {
                if (!segm.getArrivalDate().isBefore(segm.getDepartureDate())) {
                    ex = true;
                }
            }
            if (ex) {
                arriveAfterDeparture.add(flight);

            }
        }
        return arriveAfterDeparture;
        }
}
