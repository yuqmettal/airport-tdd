package com.devsu.airport.clients;

import com.devsu.airport.flight.Flight;
import com.devsu.airport.flight.FlightComment;

import java.util.List;

public class CommentClient extends CommonClient<FlightComment> {

    private static final String urlComments = "https://jsonplaceholder.typicode.com/posts";

    public CommentClient() {
        super(FlightComment.class, urlComments);
    }

    public FlightComment getComment(Flight businessFlight) {
        return getSingleResponse(businessFlight.getId());
    }

    public List<FlightComment> getCommentList(Flight businessFlight) {
        return getListResponseQueryParam("userId", businessFlight.getId());
    }
}
