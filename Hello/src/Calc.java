import java.util.Stack;

public class Calc {

    public static String ExpressionToRPN(String Expression) {
        String current = "";
        Stack<Character> stack = new Stack<>();
        int priority;
        for (int i = 0; i < Expression.length(); i++) {
            priority = getPriority(Expression.charAt(i));
            if (priority == 0) current += Expression.charAt(i);
            if (priority == 1) stack.push(Expression.charAt(i));
            if (priority > 1) {
                current += ' ';
                while (!stack.empty()) {
                    if (getPriority(stack.peek()) >= priority) current += stack.pop();
                    else break;
                }
                stack.push(Expression.charAt(i));
            }

            if (priority == -1) {
                current += ' ';
                while (getPriority(stack.peek()) != 1) current += stack.pop();
                stack.pop();
            }
            ;
        }

        while (!stack.empty()) current += stack.pop();
        return current;
    }

    public static Double RPNtoAnswer(String rpn) {
        String operand = new String();
        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < rpn.length(); i++) {
            if (rpn.charAt(i) == ' ') continue;
            if (getPriority(rpn.charAt(i)) == 0) {
                while (rpn.charAt(i) != ' ' && getPriority(rpn.charAt(i)) == 0) {
                    operand += rpn.charAt(i++);
                    if (i == rpn.length()) break;
                }
                stack.push(Double.parseDouble(operand));
                operand = new String();
            }
            if (getPriority(rpn.charAt(i)) > 1) {
                double tmp1 = stack.pop();
                double tmp2 = stack.pop();
                if (rpn.charAt(i) == '+') stack.push(tmp2+tmp1);
                if (rpn.charAt(i) == '-') stack.push(tmp2-tmp1);
                if (rpn.charAt(i) == '*') stack.push(tmp2*tmp1);
                if (rpn.charAt(i) == '/') stack.push(tmp2/tmp1);
            }
        }
        return stack.pop();
    }

    private static int getPriority(char token) {
        if (token == '*' || token == '/') return 3;
        else if (token == '+' || token == '-') return 2;
        else if (token == '(') return 1;
        else if (token == ')') return -1;
        else return 0;
    }


   /* private static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {

        String str = in.nextLine();
        String[] strings = str.split(" ");
        Stack<Double> stack = new Stack<Double>();
        for (int i = 0; i < strings.length; i++) {
            if (isNumber(strings[i])) {
                stack.push(Double.parseDouble(strings[i]));
            } else {
                double tmp1 = stack.pop();
                double tmp2 = stack.pop();
                switch (strings[i]) {
                    case "+":
                        stack.push(tmp2 + tmp1);
                        break;
                    case "-":
                        stack.push(tmp2 - tmp1);
                        break;
                    case "*":
                        stack.push(tmp2 * tmp1);
                        break;
                    case "/":
                        stack.push(tmp2 / tmp1);
                        break;
                }
            }
        }

        if (!stack.empty()) {
            System.out.println(stack.pop());
        } else {
            System.out.println("Error");
        }
    }

    private static boolean isNumber(String string) {
        try {
            Double.parseDouble(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }*/
}


