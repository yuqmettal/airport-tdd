package com.devsu.airport;

import com.devsu.airport.clients.CommentClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CommentTest {

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
