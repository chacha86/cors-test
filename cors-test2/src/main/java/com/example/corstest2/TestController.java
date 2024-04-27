package com.example.corstest2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
//@CrossOrigin(origins = "http://localhost:8988")
public class TestController {
    @PostMapping("/test")
    @ResponseBody
    public String test() {
        return "{\"data\" : \"아주 중요한 정보\"}";
    }
}
