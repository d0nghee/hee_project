package com.toyproject.deliveryking.rider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/api/v1")
public class RiderController {

    @GetMapping("/login")
    public String index() {
        return "hi";
    }
}
