package exception;
/*
* Example of creating custom exception.
* */

class MyCustomException extends RuntimeException{
    public MyCustomException(String message) {
        super(message);
    }
}

public class MyException {
    public static void main(String[] args) {
        try{
            int i = 5/0;
        }catch (MyCustomException exception){
            exception.printStackTrace();
        }
    }

}
