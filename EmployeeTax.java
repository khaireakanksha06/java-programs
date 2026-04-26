//To Calculate and Display the Tax deducted from an Employee's Salary
import java.util.*;
class TaxCalculator{
        static void calculateTax(double sal) {
                System.out.println("Salary= "+sal);
                double tax= (sal*15)/100;

                System.out.println("tax amount= "+tax);
                double rmsal=sal-tax;

                System.out.println("Remaining Salary = "+rmsal);

        }
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Salary: ");
                double sal= sc.nextDouble();

                calculateTax(sal);
        }
}
