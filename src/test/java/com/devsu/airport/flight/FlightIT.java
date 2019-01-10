package com.devsu.airport.flight;

import com.devsu.airport.clients.CommentClient;
import com.devsu.airport.flight.BusinessFlight;
import com.devsu.airport.flight.Flight;
import com.devsu.airport.flight.FlightComment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

class FlightIT {
    @Mock
    private CommentClient commentService = null;

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testFlightPassengerCommentsIT() {
        Flight businessFlight = new BusinessFlight("1");

        List<FlightComment> comments = new ArrayList<>();
        comments.add(new FlightComment(1,1,"Flight # 12", "OK"));
        comments.add(new FlightComment(2,1,"Flight # 11", "OK"));
        comments.add(new FlightComment(3,4,"Flight # 2", "OK"));

        when(commentService.getCommentList(businessFlight)).thenReturn(comments);

        Assertions.assertEquals(3,commentService.getCommentList(businessFlight).size());
    }
}
