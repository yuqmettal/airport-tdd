package com.devsu.airport;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

class FlightIT {
    @Mock
    private CommentService commentService = null;

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testFlightPassengerCommentsIT() {
        Passenger passenger = new Passenger("Marco", false);
        Flight businessFlight = new BusinessFlight("1");

        when(commentService.getCommentList(businessFlight)).thenReturn(null);

        //List<FlightComment> commentList = commentService.getCommentList(passenger);

        Assertions.assertNull(commentService.getCommentList(businessFlight));

    }
}
