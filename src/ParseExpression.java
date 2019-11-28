import java.util.Scanner;

public class ParseExpression {

    public static void InputExpression(String expression) {
        String a = "";
        String b = "";
        String math = "";
        int variableA;
        int variableB = 0;
        boolean roman = false;

        expression = expression.replace(" ", "");

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '*' || expression.charAt(i) == '/')
                math += expression.charAt(i);
            else if (math.equals("")) a += expression.charAt(i);
            else b += expression.charAt(i);
        }

        if (a.equals("") || b.equals("") || math.equals("")) ExceptionClass.exitProgram();

        try {
            variableA = Integer.parseInt(a);
            if (variableA < 1 || variableA > 10) ExceptionClass.exitProgram();
        } catch (NumberFormatException e) {
            roman = true;
            variableA = NumberConverter.returnArabic(a);
            if (variableA < 1 || variableA > 10) ExceptionClass.exitProgram();
        }
        if (!roman) {
            try {
                variableB = Integer.parseInt(b);
            } catch (NumberFormatException e) {
                ExceptionClass.exitProgram();
            }
        } else {
                variableB = NumberConverter.returnArabic(b);
            }
        if (variableB < 1 || variableB > 10) ExceptionClass.exitProgram();

        MathCustom.result(variableA, variableB, math, roman);

    }

}

