package com.devsu.airport.clients;

import com.devsu.airport.Flight;
import com.devsu.airport.FlightComment;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

public class CommentClient {

    private static final String urlComments = "https://jsonplaceholder.typicode.com/posts";
    private Client client = ClientBuilder.newClient();

    public FlightComment getComment(Flight businessFlight) {

        return client
                .target(urlComments)
                .path(businessFlight.getId())
                .request(MediaType.APPLICATION_JSON_TYPE)
                .get(FlightComment.class);
    }

    public List<FlightComment> getCommentList(Flight businessFlight) {
        Response response = client
                .target(urlComments)
                .queryParam("userId",businessFlight.getId())
                .request(MediaType.APPLICATION_JSON)
                .get();

        return response.readEntity(new GenericType<List<FlightComment>>() {
        });
    }
}
