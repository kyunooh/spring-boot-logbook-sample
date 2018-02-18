package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jelly on 18/02/2018.
 */
@RequestMapping("/some")
@RestController
public class SomeController {
    @GetMapping("")
    public String arst() {
        return "arstarst";
    }
}
