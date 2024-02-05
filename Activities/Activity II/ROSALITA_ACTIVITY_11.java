import java.util.Scanner;
public class ROSALITA_ACTIVITY_11{
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int fnum = keyboard.nextInt();
        System.out.print("Enter Second number: ");
        int snum = keyboard.nextInt();

        int sum = fnum+snum;
        int diff = fnum-snum;
        int quotient = fnum*snum;

        System.out.println("The sum:" +sum);
        System.out.println("The diff:" +diff);
        System.out.println("The quotient:" +quotient);

    }
}
