import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int n, i;
        Scanner in = new Scanner(System.in);
        double num;

        GetArray [] arr = new GetArray[100];
        System.out.println("Enter number of elements: ");
        n = in.nextInt();

        for (i = 0; i < n; i++) {
            System.out.println("Enter number " + i + ":");
            num = in.nextDouble();
            arr[i] = new GetArray(num);
        }

        double middle;
        if (n % 2 == 1)
            middle = arr[n/2].getNumber();
        else
            middle = ( arr[n/2].getNumber() + arr[n/2 -1].getNumber() ) / 2;

        System.out.println("Middle: " + middle);
    }
}

class GetArray{
    private double number;

    public GetArray(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }
}

