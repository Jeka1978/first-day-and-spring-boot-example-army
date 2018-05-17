package com.army.springbootexample.chain.of.responsibility;

/**
 * @author Evgeny Borisov
 */
public interface Validator {
    String validate(Person person);
}
