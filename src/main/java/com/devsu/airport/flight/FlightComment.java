package com.devsu.airport.flight;

public class FlightComment {

    private int id;
    private int userId;
    private String title;
    private String body;

    public FlightComment(int id, int userId, String title, String body) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.body = body;
    }

    public FlightComment(){}

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
