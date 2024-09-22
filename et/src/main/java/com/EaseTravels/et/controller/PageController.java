package com.EaseTravels.et.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class PageController {

    @GetMapping("/")
    public String home() {
        log.info("Insdie home page handler");
        return "home";
    }
}
