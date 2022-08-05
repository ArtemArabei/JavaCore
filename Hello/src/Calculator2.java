import java.util.Stack;

public class Calculator2 {

    public static void main(String[] args) {
        String expression = "-1 + (-5+5)/3+7*9+(45-2)*5";
        String e = "-(-2-2)";
        System.out.println(new Calculator2().decide(expression));
        System.out.println(new Calculator2().decide(e));
    }

    public Double decide(String expression) {
        String prepared = preparingExpression(expression);
        String rpn = expressionToRPN(prepared);
        return rpnToAnswer(rpn);
    }

    private String preparingExpression (String expression) {
        String preparedExpression = new String();
        for (int token = 0; token < expression.length(); token ++) {
            char symbol = expression.charAt(token);
            if (symbol == '-') {
                if (token == 0)
                    preparedExpression += "0";
                else if (expression.charAt(token-1) == '(')
                    preparedExpression += "0";
            }
            preparedExpression += symbol;
        }
        return preparedExpression;
    }

    private String expressionToRPN(String Expression) {
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

    private Double rpnToAnswer(String rpn) {
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
                if (rpn.charAt(i) == '+') stack.push(tmp2 + tmp1);
                if (rpn.charAt(i) == '-') stack.push(tmp2 - tmp1);
                if (rpn.charAt(i) == '*') stack.push(tmp2 * tmp1);
                if (rpn.charAt(i) == '/') stack.push(tmp2 / tmp1);
            }
        }
        return stack.pop();
    }

    private int getPriority(char token) {
        if (token == '*' || token == '/') return 3;
        else if (token == '+' || token == '-') return 2;
        else if (token == '(') return 1;
        else if (token == ')') return -1;
        else return 0;
    }
}
