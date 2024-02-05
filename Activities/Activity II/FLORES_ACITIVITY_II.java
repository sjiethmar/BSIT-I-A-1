import java.util.Scanner;
public class FLORES_ACITIVITY_II {
    public static void main (String []args){
    Scanner input = new Scanner (System.in);
    int a, b;

    System.out.print("Please input your First Number= ");
    a= input.nextInt();
    System.out.print("Please enter you Second Value= ");
    b= input.nextInt();

    int sum= a + b;
    int diff= a - b;
    int prod = a * b;
    int quo= a/b;

    System.out.println("Sum= " + sum);
    System.out.println("Difference= "+ diff);
    System.out.println("Product= "+ prod);
    System.out.println("Quotient= "+ quo);
    }
}
