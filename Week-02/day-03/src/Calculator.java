import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Please type in the expression coma separeted like '3 + 3':");
    String expression = sc.nextLine();

    calculator(expression);
    }

    public static void calculator(String expression) {
        double result = 0.0;
        String[] items = expression.split(" ");
        List<String> container = Arrays.asList(items);
        String operand = container.get(0);
        String operation = container.get(1);
        String secondOperand = container.get(2);
        double operandA = Double.parseDouble(operand);
        double operandB = Double.parseDouble(secondOperand);

        if (operation.equals("+")) {
            result = operandA + operandB;
        } else if (operation.equals("-")) {
            result = operandA - operandB;
        } else if (operation.equals("*")) {
            result = operandA * operandB;
        } else if (operation.equals("/")) {
            result = operandA / operandB;
        } else if (operation.equals("%")) {
            result = operandA % operandB;
        }
        System.out.println(result);
    }
}
