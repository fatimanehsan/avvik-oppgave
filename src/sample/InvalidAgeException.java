package sample;


public class InvalidAgeException extends IllegalArgumentException{
        public InvalidAgeException (String msg) {
            super(msg);
    }
}