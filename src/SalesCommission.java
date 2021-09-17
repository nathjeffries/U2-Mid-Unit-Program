/*
A car salesperson typically earns an hourly wage and a commission on any sales they completed. They typically work 30 to 40
hours a week, earning $5.25 to $7.50 an hour. Additionally, they earn 1% to 3% of all sales they've completed that week,
which a typical car sells for $10,000 to $30,000. A salesperson with a 1% commission that sells a car for $20,000 earns $200.00.

Write a program which prompts the user to enter the hourly rate, hours worked, the sales commission percent and the total
sales of a salesperson and calculates their total earnings. The program should include multiple methods. (What ARE the
smaller pieces?)

Example:

Hourly Rate: 6.25
Hours Worked: 33.5
Sales Commission: 1.5%
Total Sales: $65,000.00

Total Earnings: $1184.38

main method to call other methods
input method to get input
calculation method to calculate
output method to output info
 */
import javax.swing.*;
import java.text.DecimalFormat;
public class SalesCommission {

    public static void main(String[] args) {
        double hourlyRate = Double.parseDouble(JOptionPane.showInputDialog("What is the hourly rate at which you get paid?"));
        double hoursWorked = Double.parseDouble(JOptionPane.showInputDialog("How many hours did you work?"));
        double salesCommission = Double.parseDouble(JOptionPane.showInputDialog("What is the sales commission percentage?"));
        double totalSales = Double.parseDouble(JOptionPane.showInputDialog("What is the total sales?"));

        calculate(hourlyRate, hoursWorked, totalSales,salesCommission);
        DecimalFormat round = new DecimalFormat("#,###.00");
        JOptionPane.showMessageDialog(null, "Your total earnings are: $" + round.format(calculate(hourlyRate, hoursWorked, totalSales,salesCommission)));
        System.exit(0);
    }


    private static double calculate(Double hourlyRate, Double hoursWorked, Double totalSales, Double salesCommission) {
        double earnings = hourlyRate * hoursWorked + (totalSales *(salesCommission/100));
        return earnings;
    }



}
