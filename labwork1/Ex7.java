public class Ex7 {
    public static void main(String[] args) {
        String num1 = args[0]; double a = Double.parseDouble(num1);
        String num2 = args[1]; double b = Double.parseDouble(num2);
        String num3 = args[2]; double c = Double.parseDouble(num3);

        double delta = Math.pow(b,2) - 4 * a * c;
        if (delta < 0)
            System.out.println("No result");
        else if (delta == 0)
            System.out.println("1 result = " + -b / (2*a));
        else{
            double x1 = (- b + Math.sqrt(delta)) / (4*a);
            double x2 = (- b - Math.sqrt(delta)) / (4*a);
            System.out.println("Result 1: " + x1);
            System.out.println("Result 2: " + x2);
        }

    }
}
