package org.launchcode.Temperature;

// TODO 1: First, all custom exceptions must inherit from the Exception class.
public class TemperatureException extends Exception {

    // TODO 2: With the relationship between the two classes set up, we now need to add a constructor.
    //  In this case, that is all we need to add. We do not want to call the Exception class directly,
    //  so we will use TemperatureException to access its properties. The constructor will only have to
    //  deal with a message parameter.

    // create a constructor that constructs a new exception with the given detailed message
    public TemperatureException(String message){ // uses the public Exception(String message) constructor provided by the Exception class
        super(message); // enables us to access the Exception constructor
    }




}
