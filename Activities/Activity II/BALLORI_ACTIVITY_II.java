import java.util.Scanner;
public class BALLORI_ACTIVITY_II {
    public static void main (String []args){
        Scanner input = new Scanner (System.in);


        System.out.print("Input First Number= ");
        int Fnum = input.nextInt();

        System.out.print("Input Second Number= ");
        int Snum = input.nextInt();

        int Sum = Fnum + Snum;
        int Sub = Fnum - Snum;
        int Mul = Fnum * Snum;

        System.out.println("Sum: "+Sum);
        System.out.println("Subtraction: "+Sub);
        System.out.println("Multiplication: "+Mul);


    }
}
