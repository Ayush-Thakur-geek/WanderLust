package com.EaseTravels.et.controller;

import com.EaseTravels.et.services.FlightService;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flight")
public class FlightController {
    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/getFlights")
    public JsonNode searchFlights(String flightInfo) {
        return flightService.getFlights(flightInfo);
    }
}
