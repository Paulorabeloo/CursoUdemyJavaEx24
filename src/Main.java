import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);

        System.out.printf("Name: ");
        emp.name = sc.nextLine();
        System.out.printf("Gross salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.printf("Tax: ");
        emp.tax = sc.nextDouble();


        System.out.println("Employee: " + emp.name + ", $ " + emp.NetSalary());
        System.out.println("");
        System.out.printf("Wich percentage to inscrease Salary? ");
        double percentage = sc.nextDouble();
        emp.IncreaseSalary(percentage);
        System.out.println("");
        System.out.println("Updated data: " + emp.name + ", $ " + emp.NetSalary());
    }
}