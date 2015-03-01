package com.wcs.fizzbuzz;

public class FizzBuzzer {
    
    public String execute(int number) {
        
        String visszaAdottErtek="";
        
        if (number%3==0) {
            visszaAdottErtek="fizz";
        }
        if (number%5==0) {
            visszaAdottErtek+="buzz";
        }
        
        //házi
        if (number%7==0) {
            visszaAdottErtek+="wizz";
        }
        
        if (Integer.toString(number).contains("3")) {
            visszaAdottErtek+="fizz";
        }
        
        
        
        if (visszaAdottErtek.isEmpty()) {
            visszaAdottErtek=""+number;
        }
        
        return visszaAdottErtek;
    }
    
}
