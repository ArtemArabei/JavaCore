public class TestCalc {

    public static void main(String[] args) {
        System.out.println(Calc.ExpressionToRPN("(5 + 5) / 3 + 7 * 9 + (45-2)*5"));
        System.out.println(Calc.RPNtoAnswer(Calc.ExpressionToRPN("(5 + 5) / 3 + 7 * 9 + (45-2)*5")));
    }
}
