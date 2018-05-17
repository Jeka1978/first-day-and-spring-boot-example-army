package com.army.springbootexample.chain.of.responsibility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Service
public class PersonValidator {
    private final List<Validator> validators;

    @Autowired
    public PersonValidator(List<Validator> validators) {
        this.validators = validators;
    }

    public String validate(Person person) {
        StringBuilder errorMessage = new StringBuilder();
        for (Validator validator : validators) {
            errorMessage.append(validator.validate(person));
        }
        return errorMessage.toString();
    }
}
