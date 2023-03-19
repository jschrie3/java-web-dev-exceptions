package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // create a Scanner object to take user input for points possible
        int totalPointsPossible; // declare points possible
        Scanner input; // declare input variable
        input = new Scanner(System.in); // initialize input
        System.out.println("Enter the total points possible for this assignment: "); // ask user for input
        totalPointsPossible = input.nextInt(); // assign user input to totalPointsPossible
        input.close(); // close Scanner

        // call HashMap constructor
        HashMap<String, String> studentFiles = new HashMap<>();
        // student names and files are added to HashMap with .put
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // TODO: Test out your Divide() function!
        // TODO: Test out your CheckFileExtension() function!

        // create a loop to access key/value pairs and calculate, print student grades
        for (Map.Entry<String, String> student : studentFiles.entrySet()) { // for each student/file in HashMap

                // declare variables
                int pointsEarned;
                int studentScore;

                // pass file to CheckFileExtension and assign output to pointsEarned
                pointsEarned = CheckFileExtension(student.getValue());
                // call Divide function to make sure the TA doesn't enter 0 for totalPointsPossible
                Divide(pointsEarned, totalPointsPossible);
                // Divide tests the grades for errors, but does not return a score
                // calculate student scores
                studentScore = pointsEarned / totalPointsPossible;

                // print students' scores
                System.out.println("Student: " + student.getKey() + "  |  " +
                        "Assignment Score: " + studentScore);
        }
    }

    // TODO 11.2.1. - Divide By Zero!
    public static void Divide(int x, int y) {

        // TODO 11.2.1b - However, if y is zero, you should throw an exception. Try to use an ArithmeticException
        //  and put your try/catch block in Divide() to test out your error-handling skills. If an exception is caught,
        //  make sure to print out a helpful message.

        if (y == 0) {
            try {
                throw new ArithmeticException("Oops! You can't enter 0 for the total number of possible points.");
            }
            catch(ArithmeticException e) {
                e.printStackTrace();
            }
        }

        // TODO 11.2.1a - Your function should return the result of x/y.
        int grade = x/y;
    }

    // TODO 11.2.2. - Test Student Labs
    public static int CheckFileExtension(String fileName) {

        // TODO 11.2.2a - CheckFileExtension() should return an integer representing the number of points a student
        //  receives for properly submitting a file in Java.

        // declare points variable
        int pointsReceived = 0;

        // TODO 11.2.2b - If a student’s submitted file ends in .java, they get 1 point. If a student’s submitted file
        //  does not end in .java, they get 0 points. If the file submitted is null or an empty string, an exception should
        //  be thrown and you should give the student -1 points.

        if (!fileName.isEmpty()){ // if fileName string is not empty

            if (fileName.endsWith(".java")) { // if fileName ends with .java
                pointsReceived = 1; // then the student gets 1 point
            } else if (!fileName.endsWith(".java")) { // if fileName does not end with .java
                return pointsReceived; // then the student gets 0 points (value already initialized)
            }

        } else if (fileName.isEmpty()){ // else if the fileName string is empty
            try {
                // created a user-defined exception that extends the Exception class
                // if an error is caught, print the message
                throw new FileException("Sorry, this student did not submit a file.");
            }
            catch(FileException e) {
                // if an error is caught print the stack trace and return -1 points
                pointsReceived = -1;
                e.printStackTrace();
            }
        }

        // TODO 11.2.2c - In Main(), Professor Jackson has provided a hashmap of students and the names of their submitted
        //  files for you to test out your work. If an exception is caught, make sure to print out the error message.

        // return statement (int)
        return pointsReceived;
    }

}
