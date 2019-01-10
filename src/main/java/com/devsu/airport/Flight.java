package com.devsu.airport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Flight {

    private String id;
    List<Passenger> passengersList = new ArrayList<>();

    Flight(String id) {
        this.id = id;
    }

    String getId() {
        return id;
    }

    List<Passenger> getPassengersList() {
        return Collections.unmodifiableList(passengersList);
    }


    abstract boolean addPassenger(Passenger passenger);

    abstract boolean removePassenger(Passenger passenger);
}