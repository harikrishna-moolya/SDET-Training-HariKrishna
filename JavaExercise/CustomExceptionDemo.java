package ofc1;

import java.util.*;


class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}


class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}


class DatabaseConnectionException extends Exception {
    public DatabaseConnectionException(String message) {
        super(message);
    }
}


public class CustomExceptionDemo {

    
    public static void validateInput(int age) throws InvalidInputException {
        if (age<18 || age>65) {
            throw new InvalidInputException("Age Cannot be less than 18 and greater than 65!!!");
        }
        System.out.println("Valid Age: " + age);
        System.out.println("Eligible for Marriage");
    }

    public static void fetchResource(String resourceName) {
        if (!resourceName.equals("myfile.txt")) {
            throw new ResourceNotFoundException("Resource '" + resourceName + "' not found!");
        }
        System.out.println("Resource found: " + resourceName);
    }

    // Method to simulate connecting to a database
    public static void connectToDatabase(boolean connected) throws DatabaseConnectionException {
        if (!connected) {
            throw new DatabaseConnectionException("Failed to connect to database!");
        }
        System.out.println("Database connected successfully!");
    }

    public static void main(String[] args) {
        try {
            //InvalidInputException
            validateInput(70);  
            
            //ResourceNotFoundException
            fetchResource("hk");

            //DatabaseConnectionException
            connectToDatabase(false);

        } catch (InvalidInputException e) {
            System.out.println(" Invalid Input Error: " + e.getMessage());
        } catch (DatabaseConnectionException e) {
            System.out.println(" Database Error: " + e.getMessage());
        } catch (ResourceNotFoundException e) {
            System.out.println(" Resource Error: " + e.getMessage());
        } finally {
            System.out.println(" Exception handling complete.");
        }
    }
}
