package com.army.springbootexample.chain.of.responsibility;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class NameValidator implements Validator {
    @Override
    public String validate(Person person) {
        if (person.getName()==null) {
            return "name can't be null";
        }
        return "";
    }
}
