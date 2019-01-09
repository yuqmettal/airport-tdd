package com.marco.airport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Flight {

    private String id;
    List<Passenger> passengersList = new ArrayList<>();

    public Flight(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public List<Passenger> getPassengersList() {
        return Collections.unmodifiableList(passengersList);
    }


    abstract boolean addPassenger(Passenger passenger);

    abstract boolean removePassenger(Passenger passenger);
}
