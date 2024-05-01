package calculator;

public class SubtractOperator<T extends Number> implements Operator<T>{
    public double operate(T firstNum, T secondNum) throws ArithmeticException {

        //언박싱
        double firstnum = (double) firstNum;
        double secondnum = (double) secondNum;

        return firstnum - secondnum;
//        return OperatorType.MINUS.apply(firstNum,secondNum);
    }
}
