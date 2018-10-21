public class Ex9 {
    public static void main(String[] args) {
        double []arr = new double[100];
        int length = args.length;

        int i;
        double sum1 = 0, sum2 = 0;
        for (i = 0; i< length; i++){
            arr[i] = Double.parseDouble(args[i]);
            sum1 += arr[i];
        }
        double mean = sum1 / length;
        System.out.println("Mean: " + mean);

        double []arr_square = new double[100];
        for (i = 0; i < length; i++){
            arr_square[i] = arr[i] - mean;
            sum2 += Math.pow(arr_square[i], 2);
        }
        sum2 /= (length - 1);
        System.out.println("Standard Deviation: " + Math.sqrt(sum2));

    }
}
