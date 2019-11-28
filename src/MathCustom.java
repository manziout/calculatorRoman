public class MathCustom {

    public static void result(int a, int b, String s, boolean roman) {
        int i;
        switch (s) {
            case "+":
                i = a + b;
                if (roman) {
                    System.out.println(NumberConverter.returnRoman(i));
                } else System.out.println(i);
                break;
            case "-":
                i = a - b;
                if (i < 1) ExceptionClass.exitProgram();
                if (roman) {
                    System.out.println(NumberConverter.returnRoman(i));
                } else System.out.println(i);
                break;
            case "*":
                i = a * b;
                if (roman) {
                    System.out.println(NumberConverter.returnRoman(i));
                } else System.out.println(i);

                break;
            case "/":
                if (a % b != 0) ExceptionClass.exitProgram();
                i = a / b;
                if (roman) {
                    System.out.println(NumberConverter.returnRoman(i));
                } else System.out.println(i);
                break;
        }

    }
}
