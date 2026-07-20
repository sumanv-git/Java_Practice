package exceptions;

import java.util.logging.Logger;



class CustomAgeException extends Exception {
    public CustomAgeException(String message) {
        super(message);
    }
}
public class CustomException {

    private static final Logger logger = Logger.getLogger(CustomException.class.getName());



    public static void main(String[] args) {
        try{
            validateAge(17);
        }catch (CustomAgeException e){
           logger.severe("Custom exception occurred: " + e.getMessage());
        }

    }

     static void validateAge(int age) throws CustomAgeException {
        if (age < 18) {
            throw new CustomAgeException("Age should be greater than or equal to 18");
        }
    }
}
