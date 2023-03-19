package org.launchcode.exercises;

// custom exceptions must inherit from the Exception class
public class FileException extends Exception {

    // create a constructor that constructs a new exception with the given detailed message
    public FileException(String message) { // uses the public Exception(String message) constructor provided by the Exception class
        super(message); // enables us to access the Exception constructor
    }
}
