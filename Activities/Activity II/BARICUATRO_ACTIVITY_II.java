import java.util.Scanner;
public class BARICUATRO_ACTIVITYII {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int value1, value2, sum, diff, prod, quo;
        
        System.out.print("Please enter a value: ");
        value1 = sc.nextInt();
        System.out.print("Please enter a second value: ");
        value2 = sc.nextInt();

        sum = value1 + value2;
        diff = value1 - value2;
        prod = value1 * value2;
        quo = value1 / value2;

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Product = " + prod);
        System.out.println("Quotient = " + quo);

    }
}
