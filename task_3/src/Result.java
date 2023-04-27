public class Result {
    private double num1,num2,result;
    private char operator;

    public Result(double num1, double num2, double result, char operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
        this.operator = operator;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double getResult() {
        return result;
    }

    public char getOperator() {
        return operator;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }
}
