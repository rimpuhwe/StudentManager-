public class StudentException extends Exception {
    /**
     * this is a constructor which inherited from Exception class . it is purposely created to make a custom error handling message
     * @param message
     */
    public StudentException(String message) {
        super(message);
    }
}
