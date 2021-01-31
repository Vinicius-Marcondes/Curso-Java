package com.studies.exercisesSB.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @GetMapping("/sum/{num_1}/{num_2}")
    public float sum(@PathVariable float num_1, @PathVariable float num_2) {
        return num_1 + num_2;
    }

    @GetMapping("/sub")
    public float sub(@RequestParam("num_1") float num_1, @RequestParam("num_2") float num_2) {
        return num_1 - num_2;
    }
}
