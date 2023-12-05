package com.toyproject.deliveryking.rider;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RiderController {

    @GetMapping("/index")
    public String index() {
        return "hi";
    }
}
