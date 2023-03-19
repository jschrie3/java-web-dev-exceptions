package org.launchcode.Temperature;

public class Temperature {

    private double fahrenheit;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double aFahrenheit) {

        double absoluteZeroFahrenheit = -459.67;

        // TODO 3: We need to use this exception to prevent the temperature from being set to a value that is
        //  below absolute zero. We need to encase our exception in a try/catch block. We want to try to throw
        //  the exception and if we catch the error, we want to print the stack trace.

        if (aFahrenheit < absoluteZeroFahrenheit) {
            // The try statement allows you to define a block of code to be tested for errors while it is being executed.
            try {
                throw new TemperatureException("That temperature is too low!");
                // The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
            } catch (TemperatureException e) {
                e.printStackTrace();
            }
        }

        fahrenheit = aFahrenheit;
    }
}
