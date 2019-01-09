package com.marco.airport;

public class EconomyFlight extends Flight {
    public EconomyFlight(String id) {
        super(id);
    }

    @Override
    public boolean addPassenger(Passenger passenger) {
        return passengersList.add(passenger);
    }

    @Override
    boolean removePassenger(Passenger passenger) {
        if (passenger.isVip()){
            return false;
        }
        return passengersList.remove(passenger);
    }
}
