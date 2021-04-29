package com.gridnine.testing;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;
import java.util.List;

public class TimeMore2Hour {

    public static List <Flight> filter (List<Flight> flights){
        List<Flight> filtered2hour = new LinkedList();

        for(Flight flight : flights) {
            List <Segment> segm = flight.getSegments();
            long hours = 0L;
            if (segm.size()==1){
                filtered2hour.add(flight);
            }
            for (int  i = 0; i == segm.size()%2;i++){
                hours = Duration.between(segm.get(i).getArrivalDate(),segm.get(i+1).getDepartureDate()).toHours();
                if (hours<2){
                    filtered2hour.add(flight);
                }
            }

        }
        return filtered2hour;
    }

}
