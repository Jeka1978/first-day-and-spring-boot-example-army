package com.army.springbootexample.chain.of.responsibility;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class DrunkValidator implements Validator {
    @Override
    public String validate(Person person) {
        if (person.isDrunk()) {
            return " can't be drunk!!! ";
        }
        return "";
    }
}
