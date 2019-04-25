package StepDefinitions;

public class Calculator {

    public int addTwoNumbers(int number1, int number2) {
        return number1 + number2;
    }

    public int addThreeNumbers(int number1, int number2, int number3) {
        return addTwoNumbers(number1, number2) + number3;
    }

    public int addFourNumbers(int number1, int number2, int number3, int number4) {
        return addThreeNumbers(number1, number2, number3) + number4;
    }

    public int subtract(int number1, int number2) {
        return number1 - number2;
    }

    public int multiplyTwoNumbers(int number1, int number2) {
        return number1 * number2;
    }

    public int multiplyThreeNumbers(int number1, int number2, int number3) {
        return multiplyTwoNumbers(number1, number2) * number3;
    }

    public int divide(int number1, int number2) {
        if (number2 == 0) {
            System.out.println("Error: denominator is zero.");
            return -1;
        } else {
            return number1 / number2;
        }
    }
}