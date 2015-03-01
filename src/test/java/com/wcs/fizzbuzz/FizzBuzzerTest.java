package com.wcs.fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzerTest {

    private FizzBuzzer fizzBuzzer = new FizzBuzzer();

    @Test
    public void executeShouldReturnFizzIfTheNumberIsDividableBy3() {
        assertEquals("fizz", fizzBuzzer.execute(9));
    }

    @Test
    public void executeShouldReturnBuzzIfTheNumberIsDividableBy5() {
        assertEquals("buzz", fizzBuzzer.execute(10));
    }
    
    @Test
    public void executeShouldReturnWizzIfTheNumberIsDividableBy7() {
        assertEquals("wizz", fizzBuzzer.execute(91));
    }

    @Test
    public void executeShouldReturnBuzzIfTheNumberIsDividableBy15() {
        assertEquals("fizzbuzz", fizzBuzzer.execute(60));
    }

    @Test
    public void executeShouldReturnFizzWizzIfTheNumberIsDividableBy21() {
        assertEquals("fizzwizz", fizzBuzzer.execute(21));
    }
    
    @Test
    public void executeShouldReturnBuzzWizzIfTheNumberIsDividableBy35() {
        assertEquals("buzzwizz", fizzBuzzer.execute(1400));
    }
    
    @Test
    public void executeShouldReturnFizzIfTheNumberIsContains3(){
        assertEquals("fizz", fizzBuzzer.execute(90000013));
    }
    
    @Test
    public void executeShouldReturnBuzzIfTheNumberIsContains5(){
        assertEquals("buzz", fizzBuzzer.execute(592));
    }
    
    @Test
    public void executeShouldReturnWizzIfTheNumberIsContains7(){
        assertEquals("wizz", fizzBuzzer.execute(794));
    }
    
    @Test
    public void executeShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {
        assertEquals("1", fizzBuzzer.execute(1));
        assertEquals("2", fizzBuzzer.execute(2));
        assertEquals("4", fizzBuzzer.execute(4));
        assertEquals("8", fizzBuzzer.execute(8));
    }

}
