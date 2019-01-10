package com.devsu.airport;

class BusinessFlight extends Flight {
    BusinessFlight(String id) {
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
