package com.devsu.airport.clients;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

class CommonClient<T> {
    private final Class<T> type;
    private final String url;
    private final Client client = ClientBuilder.newClient();

    CommonClient(Class<T> type, String url) {
        this.type = type;
        this.url = url;
    }

    T getSingleResponse(String path) {
        return client
                .target(url)
                .path(path)
                .request(MediaType.APPLICATION_JSON)
                .get(type);
    }

    List<T> getListResponseQueryParam(String queryParam, Object value) {
        Response response = client
                .target(url)
                .queryParam(queryParam, value)
                .request(MediaType.APPLICATION_JSON)
                .get();

        return response.readEntity(new GenericType<List<T>>() {
        });
    }

}
