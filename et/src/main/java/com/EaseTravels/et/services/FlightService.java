package com.EaseTravels.et.services;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FlightService {
    private final String AVIATIONSTACK_API_KEY = "fae14eaeb2cbe1b80e8cf6c5ecc96d0c";
    private final String AVIATIONSTACK_API_URL = "http://api.aviationstack.com/v1/flights";

    private RestTemplate restTemplate = new RestTemplate();

    public JsonNode getFlights(String flightInfo) {
        String url = AVIATIONSTACK_API_URL + "?access_key=" + AVIATIONSTACK_API_KEY + "&flight_iata=" + flightInfo;

        ResponseEntity<JsonNode> response = restTemplate.exchange(url, org.springframework.http.HttpMethod.GET, null, JsonNode.class);

        return response.getBody();
    }
}
