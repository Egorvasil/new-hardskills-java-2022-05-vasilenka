package by.vasilenka.randomizer.controllers;

import by.vasilenka.randomizer.services.RandomNumberGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.SecureRandom;
import java.util.Random;

@RestController
@RequestMapping("/number")
public class NumberController {

    @Autowired
    private RandomNumberGenerator randomNumberGenerator; //IoC (dependence)

    // service
    // Get request localhost8080:number?limit=value
    @GetMapping
    private Integer getRandomNumber(@RequestParam(name = "limit") Integer numberLimit){
        return randomNumberGenerator.next(numberLimit);
    }


}
