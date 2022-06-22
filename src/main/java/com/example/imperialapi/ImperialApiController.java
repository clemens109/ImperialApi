package com.example.imperialapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImperialApiController {

    @RequestMapping("/itocm")
    public double cm(@RequestParam int a) {
        return 2.54 * a;
    }

    @RequestMapping("/ytom")
    public double m(@RequestParam int a) {
        return a * 0.9144;
    }
}
