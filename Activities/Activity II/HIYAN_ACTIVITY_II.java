import java.util.Scanner;
public class HIYAN_ACTIVITY_II{
    public static void main (String []args){
 Scanner input = new Scanner(System.in);

        System.out.print("Input First Number= ");
        int fnum = input.nextInt();

        System.out.print("Input Second Number= ");
        int snum = input.nextInt();

        int sum = fnum + snum;
        int sub = fnum - snum;
        int mul = fnum * snum;

        System.out.println("Sum: "+sum);
        System.out.println("Subtraction: "+sub);
        System.out.println("Multiplication: "+mul);


    }
    }
