import java.util.Scanner;
public class FLORES_ACTIVITY_VI {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

        System.out.print("Please Enter the number of Seconds: ");
        int time= input.nextInt();

        while (time>=0){
            System.out.println(time);
            time--;
        }
    }

}
