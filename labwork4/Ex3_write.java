import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex3_write {
    public static void main(String[] args) throws FileNotFoundException {

        /* GET THE INPUT */
        int n, i;
        Employee [] arr = new Employee[100];
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of employees: ");
        n = in.nextInt();

        String ID;
        String fullName;
        String dob;
        String department;
        String workingPos;
        String startWorkingDate;
        double seniority;
        double monthly;
        // Start take the information into an array
        for( i = 0; i < n; i++){
            System.out.println("***Please enter some information for Employee["+ (i+1) +"] : ");
            in.nextLine();

            System.out.print("ID: "); ID = in.nextLine();
            System.out.print("Full name: "); fullName = in.nextLine();
            System.out.print("Date of birth: "); dob = in.nextLine();
            System.out.print("Department: "); department = in.nextLine();
            System.out.print("Working position: "); workingPos = in.nextLine();
            System.out.print("Start working date: "); startWorkingDate = in.nextLine();
            System.out.print("Seniority Coefficient: "); seniority = in.nextDouble();
            System.out.print("Monthly performance evaluation coefficient: ");
            monthly = in.nextDouble();

            arr[i] = new Employee(ID, fullName, dob, department, workingPos,
                    startWorkingDate, seniority, monthly);
        }

        /* PRINT INPUT TO A FILE*/
        PrintStream o = new PrintStream(new File("employees.txt"));
        System.setOut(o);
        for(i = 0; i < n; i++) {
            System.out.println("Order: " + (i+1));
            System.out.println("ID: " + arr[i].getID());
            System.out.println("Full name: " + arr[i].getFullName());
            System.out.println("DOB: " + arr[i].getDateOfBirth());
            System.out.println("Department: " + arr[i].getDepartment());
            System.out.println("Working position: " + arr[i].getWorkingPosition());
            System.out.println("Start working date: " + arr[i].getStartWorkingDate());
            System.out.println(arr[i].getSeniority());
            System.out.println(arr[i].getMonthlyPerformance());
        }
        o.close();
    }
}

class Employee{
    private String ID;
    private String fullName;
    private String dateOfBirth;
    private String department;
    private String workingPosition;
    private String startWorkingDate;
    private double seniority;
    private double monthlyPerformance;

    public Employee(String ID, String fullName, String dateOfBirth, String department, String workingPosition,
                    String startWorkingDate, double seniority, double monthlyPerformance) {
        this.ID = ID;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.workingPosition = workingPosition;
        this.startWorkingDate = startWorkingDate;
        this.seniority = seniority;
        this.monthlyPerformance = monthlyPerformance;
    }

    public String getID() {
        return ID;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public String getWorkingPosition() {
        return workingPosition;
    }

    public String getStartWorkingDate() {
        return startWorkingDate;
    }

    public double getSeniority() {
        return seniority;
    }

    public double getMonthlyPerformance() {
        return monthlyPerformance;
    }
}

