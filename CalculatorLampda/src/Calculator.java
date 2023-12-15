public class Calculator {

    public int executeOperation(int x, int y, Operations operations) {
        return operations.calculate(x, y);
    }
}
