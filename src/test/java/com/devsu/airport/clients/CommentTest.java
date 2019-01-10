package com.devsu.airport.clients;

import com.devsu.airport.clients.CommentClient;
import com.devsu.airport.flight.BusinessFlight;
import com.devsu.airport.flight.Flight;
import com.devsu.airport.flight.FlightComment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class CommentTest {

    @Test
    void getCommentFromService() {
        Flight flight = new BusinessFlight("1");
        CommentClient service = new CommentClient();

        FlightComment comment = service.getComment(flight);

        Assertions.assertEquals(1, comment.getId());
    }

    @Test
    void getCommentListFromService() {
        Flight flight = new BusinessFlight("1");
        CommentClient service = new CommentClient();

        List<FlightComment> comments = service.getCommentList(flight);

        Assertions.assertTrue(comments.size() > 0);
    }
}
