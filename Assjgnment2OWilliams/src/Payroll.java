import java.util.Scanner;

//Olijah Williams
//COMP152-001
//Assignment 2
//1/24/2023
public class Payroll {
    public static void main(String[] args) {


        Scanner userInputScanner = new Scanner(System.in);
        // Get user First Name
        System.out.println("Enter Your first Name:");
        String firstName = userInputScanner.nextLine();


        //Get user Last name
        System.out.println("Enter your last name:");
        String Lastname = userInputScanner.nextLine();


        //Ask user how many hours they worked
        System.out.println("How many hours did you work for this week: ");
        double hoursWorked = userInputScanner.nextDouble();


        //Ask the user for their hourly pay rate
        System.out.println("What is hourly rate: ");
        double hourlyPayRate = userInputScanner.nextDouble();


        //Calculate the total pay


        double pay = hoursWorked * hourlyPayRate;
        // Print the user's information and gross pay
        System.out.println("\nPayroll Information:");
        System.out.println("Name: " + firstName + " " + Lastname);
        System.out.println(firstName + " " + Lastname +" earns an hourly rate of $"+hourlyPayRate);
        System.out.println(firstName + " " + Lastname + " worked " + hoursWorked + " hours this week");
        System.out.println(firstName + " " + Lastname + " pay for the week will be $" + pay);



    }
}