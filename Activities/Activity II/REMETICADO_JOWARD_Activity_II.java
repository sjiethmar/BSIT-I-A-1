import java.util.Scanner;

public class REMETICADO_JOWARD_Activity_II {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int fnum = keyboard.nextInt();
        System.out.print("Enter Secnd number: ");
        int snum = keyboard.nextInt();
        
        int sum = fnum+snum;
        int diff = fnum-snum;
        int qoutient = fnum*snum;

        System.out.println("The Sum: " +sum);
        System.out.println("The Difference: " +diff);
        System.out.println("The Quotient: " +qoutient);
    }
}
