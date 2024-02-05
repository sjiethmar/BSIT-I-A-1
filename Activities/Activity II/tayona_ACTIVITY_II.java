import java.util.Scanner; 
public class tayona_ACTIVITY_II{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int fnum = keyboard.nextInt();
        System.out.print("Enter second number: ");
        int snum = keyboard.nextInt();

    int sum= fnum + snum;
    int diff= fnum - snum;
    int product = fnum * snum;

    System.out.println("Sum="+sum);
    System.out.println("Difference= "+diff);
    System.out.println("Product="+product);

    }  
}
