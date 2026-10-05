package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of sales people: ");
        final int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;

        int maxi= 0;
        int mini= 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
            if (sales[i]>sales[maxi]) {
                maxi= i;
            }
            if (sales[i]<sales[mini]) {
                mini= i;
            }
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("\nAverage sales: " + sum*1.0/SALESPEOPLE);
        System.out.println("\nSalesperson " + (maxi + 1) + " had the highest sale with $" + sales[maxi]);
        System.out.println("\nSalesperson " + (mini + 1) + " had the lowest sale with $" + sales[mini]);

        System.out.print("Enter threshold value: ");
        int threshold = scan.nextInt();
        int k= 0;
        for (int i=0; i<sales.length; i++) {
            if (sales[i]>threshold) {
                System.out.println("Salesperson " + (i+1) + " made $" + sales[i]);
                k++;
            }
        }
        System.out.println(k + " people exceeded $" + threshold);
    }
}