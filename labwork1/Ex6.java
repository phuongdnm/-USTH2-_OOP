public class Ex6 {
    public static void main(String[] args) {
        String num1 = args[0];
        double a = Double.parseDouble(num1);
        String num2 = args[1];
        double b = Double.parseDouble(num2);

        double result = -b / a;
        System.out.println("The root of the function " + a +"x + " + b + " is: " + result);
    }
}
