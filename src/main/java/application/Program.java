package application;

import model.entities.Company;
import model.entities.Individual;
import model.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner key = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = key.nextInt();


        for (int i = 1; i <= n; i++) {


            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual of company: ");
            char response = key.next().charAt(0);
            key.nextLine();
            System.out.print("Name: ");
            String name = key.nextLine();
            System.out.print("Annual Income: ");
            double annualIncome = key.nextDouble();

            if (response == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = key.nextDouble();

                TaxPayer taxPayer = new Individual(name, annualIncome, healthExpenditures);

                list.add(taxPayer);
            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = key.nextInt();

                TaxPayer taxPayer = new Company(name, annualIncome, numberOfEmployees);

                list.add(taxPayer);
            }
        }

        System.out.println();
        System.out.println("TAXES PAID: ");
        double sum = 0.00;
        for (TaxPayer tp : list) {
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
            sum += tp.tax();
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

    }
}
