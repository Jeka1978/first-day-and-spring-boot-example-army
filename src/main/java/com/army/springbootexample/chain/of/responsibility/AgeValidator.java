package com.army.springbootexample.chain.of.responsibility;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
//@Order(1)
public class AgeValidator implements Validator {
    @Override
    public String validate(Person person) {
        if (person.getAge() < 0) {
            return "age can't be negative";
        }
        return "";
    }
}
