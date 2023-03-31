package Numbers;

public class Numbers {
    public void divideBy(int num) throws IllegalArgumentException {
        if (num == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        int result = 10 / num;
        System.out.println("Result: " + result);
    }
}
