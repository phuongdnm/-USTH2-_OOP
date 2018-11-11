import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.DecimalFormat;

public class Ex3_read {
    // Format float number to 2 number after decimal dot!
    private static DecimalFormat df2 = new DecimalFormat(".##");

    public static void main(String[] args) throws Exception {
        // Read file by BufferedReader
        File file = new File("employees.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));

        int j = 1; // print order
        /* START PRINT OUT ALL INFORMATION*/
        while(reader.readLine() != null) {
            System.out.println("=========================");
            System.out.println("Order: " + j);

            // Print line 1 to 6: 6 lines just contain "String type" information
            int i;
            for (i = 0; i < 6; i++) {
                System.out.println(reader.readLine());
            }

            // Get coefficient to calculate the basic salary
            String seniority = reader.readLine();
            double seniority_coefficient = Double.parseDouble(seniority);
            double basicSalary = seniority_coefficient * 123;
            System.out.println("Basic salary = " + df2.format(basicSalary) + "$");

            // Calculate the extra salary
            String monthly = reader.readLine();
            double monthy_performance = Double.parseDouble(monthly);
            double extraSalary = monthy_performance * basicSalary;
            System.out.println("Extra salary = " + df2.format(extraSalary) + "$");

            // Calculate total salary
            double salary = basicSalary;// + extraSalary;
            System.out.println("Salary = " + df2.format(salary) + "$");
            j+=1;
            System.out.println("=========================");
        }
        reader.close();
    }
}
