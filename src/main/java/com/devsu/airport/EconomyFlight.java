package com.devsu.airport;

class EconomyFlight extends Flight {
    EconomyFlight(String id) {
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
