import Numbers.*;
public class Main {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        try {
            numbers.divideBy(2);
            numbers.divideBy(0); // exception
            numbers.divideBy(5);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument: " + e.getMessage());
        }
    }
}
