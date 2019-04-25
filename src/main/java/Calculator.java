public class Calculator {

    public double addTwoNumbers(double number1, double number2) {
        return number1 + number2;
    }

    public double addThreeNumbers(double number1, double number2, double number3) {
        return addTwoNumbers(number1, number2) + number3;
    }

    public double addFourNumbers(double number1, double number2, double number3, double number4) {
        return addThreeNumbers(number1, number2, number3) + number4;
    }

    public double subtract(double number1, double number2) {
        return number1 - number2;
    }

    public double multiplyTwoNumbers(double number1, double number2) {
        return number1 * number2;
    }

    public double multiplyThreeNumbers(double number1, double number2, double number3) {
        return multiplyTwoNumbers(number1, number2) * number3;
    }

    public double divide(double number1, double number2) {
        if (number2 == 0.0) {
            System.out.println("Error: denominator is zero.");
            return -1;
        } else {
            return number1 / number2;
        }
    }
}