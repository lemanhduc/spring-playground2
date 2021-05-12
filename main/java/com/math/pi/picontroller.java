package com.math.pi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class picontroller {

    @GetMapping("/math/pi")
    public String Get() {
        return "3.141592653589793";
    }
}
