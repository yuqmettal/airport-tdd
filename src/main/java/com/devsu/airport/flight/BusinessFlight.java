package com.devsu.airport.flight;

public class BusinessFlight extends Flight {
    public BusinessFlight(String id) {
        super(id);
    }

    @Override
    boolean addPassenger(Passenger passenger) {
        if (passenger.isVip()){
            return passengersList.add(passenger);
        }
        return false;
    }

    @Override
    boolean removePassenger(Passenger passenger) {
        return false;
    }
}
