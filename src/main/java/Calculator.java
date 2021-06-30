public class Calculator{
    public static double calculate(double number1,double number2,String operator){
        switch (operator){
            case "+" :
                return number1 + number2;
            case "-" :
                return number1 - number2;
            case "*" :
                return number1 * number2;
            case "/" :
               if (number2 != 0){
                   return number1 / number2;
               }else {
                   throw new RuntimeException("Không chia được cho 0");
               }
            default:
                throw new RuntimeException("invalid");
        }
    }
}
