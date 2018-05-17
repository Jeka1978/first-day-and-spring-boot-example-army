package com.army.springbootexample.chain.of.responsibility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Evgeny Borisov
 */
@RestController
public class PersonController {

    @Autowired
    private PersonValidator personValidator;


    @PostMapping("/person/validate")
    public String validate(@RequestBody Person person) {
        return personValidator.validate(person);
    }

    @GetMapping("/ping")
    public String ping() {
        return "Israel army is the best";
    }
}
