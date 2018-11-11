import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int n, i;
        Scanner in = new Scanner(System.in);
        Array [] arr = new Array[100];
        double number;

        System.out.println("Enter n: "); n = in.nextInt();

        for ( i = 0; i < n; i++){
            System.out.println("Enter arr[" + i + "]");
            number = in.nextDouble();
            arr[i] = new Array(number);
        }

        System.out.println("Number 2: " + arr[1].getNumber());
    }
}

class Array{
    private double number;
    // constructor
    public Array(double number) {
        this.number = number;
    }

    //getter
    public double getNumber() {
        return number;
    }
}