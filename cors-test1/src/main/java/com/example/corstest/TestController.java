package com.example.corstest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @PostMapping("/hack")
    public String hack(@RequestBody String data) {
        System.out.println(data);
        return "redirect:/test";
    }
}
