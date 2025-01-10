package interfaces;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        calculator.show();

        CalculatorWithReturn calculatorWithReturn = new CalculatorWithReturn() {
            @Override
            public int add(int i, int j) {
                return i+j;
            }
        };

        CalculatorWithReturn calculatorWithReturn1 = (i,j) -> i+j;

        int addition = calculatorWithReturn.add(2,3);
        System.out.println("Addition result: " + addition);
    }
}
