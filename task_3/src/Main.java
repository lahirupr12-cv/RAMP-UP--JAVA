import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {


    public static void main(String[] args) {
        final Logger logger =  Logger.getLogger(Main.class.getName());
        try{
            Scanner scanner = new Scanner(System.in);

            ArrayList<Result> array = new ArrayList<>();


            char isContinue = 0;
            double num1;
            double num2;
            char operator;
            do {
                logger.info("Enter first number: ");
                num1 = scanner.nextDouble();

                logger.info("Enter second number: ");
                num2 = scanner.nextDouble();

                logger.info("Enter operator (+, -, *, /): ");
                operator = scanner.next().charAt(0);

                double result = 0;

                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if(num1 == 0 || num2 ==0){
                            throw new ArithmeticException("division by zero");
                        }
                        result = num1 / num2;
                        break;
                    default:
                        throw new InvalidOperationException("please enter valid operator");
                }
                Result rs = new Result(num1,num2,result , operator);
                array.add(rs);

                logger.info("Continue Y or N?");
                isContinue = scanner.next().charAt(0);

            } while (isContinue != 'N');

            for (Result element : array) {
                logger.info(element.getNum1()+" "+element.getOperator()+" "+element.getNum2()+" = "+element.getResult());
            }
        }catch (InputMismatchException | ArithmeticException | InvalidOperationException ex){
            logger.warning(ex.getMessage());
        }


    }
}