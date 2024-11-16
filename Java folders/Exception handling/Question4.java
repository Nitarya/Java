class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
public static void riskyMethod() throws MyCustomException {
    boolean errorOccurred = true;
    if (errorOccurred) {
        throw new MyCustomException("An error occurred in riskyMethod!");
    }
}

public static void main(String[] args) {
    try {
        riskyMethod()
    } catch (MyCustomException e) {
        System.out.println("Caught exception: " + e.getMessage());
    }
}
}