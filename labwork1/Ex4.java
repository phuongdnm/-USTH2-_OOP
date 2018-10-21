public class Ex4 {
    public static void main(String[] args) {
        String number = args[0];
        int x = Integer.parseInt(number);
        int random;
        random = (int) (Math.random() * x - 1) + 0;
        System.out.println("Ramdom number between 0 and " + (x-1) + " is " + random);

    }
}