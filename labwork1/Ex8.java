public class Ex8 {
    public static void main(String[] args) {
        String x = args[0];
        int year = Integer.parseInt(x);

        if ( (year % 4 ==0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}
