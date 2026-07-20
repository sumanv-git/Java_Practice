package exceptions;

import java.util.logging.Logger;

public class WorkingWithExceptions {

    private static final Logger logger = Logger.getLogger(WorkingWithExceptions.class.getName());

    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            int result = numbers[1] / 2;
            int sno = Integer.parseInt("abc");
            logger.info("Result: " + result);
        } catch (ArithmeticException e) {
           logger.severe("ArithmeticException occurred: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.severe("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }catch (NumberFormatException e){
            logger.severe("NumberFormatException occurred: " + e.getMessage());
        }
        catch (Exception e) {
            logger.severe("An unexpected exception occurred: " + e.getMessage());
        } finally {
            logger.info("Finally block executed.");
        }
    }
}
