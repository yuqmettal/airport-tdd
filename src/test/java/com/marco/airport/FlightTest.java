package com.marco.airport;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class FlightTest {

    @Test
    void testEconomyFlightUsualPassenger() {
        Passenger passenger = new Passenger("Marco", false);
        Flight economyFlight = new EconomyFlight("1");

        Assertions.assertAll("Flight",
                () -> Assertions.assertEquals("1", economyFlight.getId()),
                () -> Assertions.assertTrue(economyFlight.addPassenger(passenger)),
                () -> Assertions.assertEquals(1, economyFlight.getPassengersList().size()),
                () -> Assertions.assertEquals("Marco", economyFlight.getPassengersList().get(0).getName()),

                () -> Assertions.assertTrue(economyFlight.removePassenger(passenger)),
                () -> Assertions.assertEquals(0, economyFlight.getPassengersList().size())
        );
    }

    @Test
    void testEconomyFlightVipPassenger() {
        Passenger passenger = new Passenger("Marco", true);
        Flight economyFlight = new EconomyFlight("1");

        final Executable executable = () -> Assertions.assertEquals(1, economyFlight.getPassengersList().size());

        Assertions.assertAll("Flight",
                () -> Assertions.assertEquals("1", economyFlight.getId()),
                () -> Assertions.assertTrue(economyFlight.addPassenger(passenger)),
                executable,
                () -> Assertions.assertEquals("Marco", economyFlight.getPassengersList().get(0).getName()),

                () -> Assertions.assertFalse(economyFlight.removePassenger(passenger)),
                executable
        );
    }

    @Test
    void testBusinessFlightUsualPassenger() {
        Passenger passenger = new Passenger("Marco", false);
        Flight businessFlight = new BusinessFlight("2");

        Executable executable = () -> Assertions.assertEquals(0, businessFlight.getPassengersList().size());

        Assertions.assertAll("Flight",
                () -> Assertions.assertEquals("2", businessFlight.getId()),
                () -> Assertions.assertFalse(businessFlight.addPassenger(passenger)),
                executable,

                () -> Assertions.assertFalse(businessFlight.removePassenger(passenger)),
                executable
        );
    }

    @Test
//    @Disabled
    void testBusinessFlightVipPassenger() {
        Passenger passenger = new Passenger("Marco", true);
        Flight businessFlight = new BusinessFlight("2");

        Executable executable = () -> Assertions.assertEquals(1, businessFlight.getPassengersList().size());

        Assertions.assertAll("Flight",
                () -> Assertions.assertEquals("2", businessFlight.getId()),
                () -> Assertions.assertTrue(businessFlight.addPassenger(passenger)),
                executable,

                () -> Assertions.assertFalse(businessFlight.removePassenger(passenger)),
                executable
        );
    }


}
