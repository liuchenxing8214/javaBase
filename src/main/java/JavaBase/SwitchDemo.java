package JavaBase;

public class SwitchDemo {
    public static void main(String[] args) {
       double result = calculate(10, 3, "/");
       System.out.println(result);
    }

    public static double calculate(double x, double y, String oper) {
        double result = 0;
        switch (oper) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "/":
                result = x / y;
                break;
            default:
                System.out.println("不作任何计算");
                break;
        }
        return result;
    }

}
