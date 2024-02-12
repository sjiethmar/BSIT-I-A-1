import java.util.Scanner;

public class REMETICADO_JOWARD_Activity_IV{
    public static void main (String []args){

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter color: ");
        String box = keyboard.nextLine();

        switch(box){
            case "Red":
            System.out.println("1");
            break;
            case "Green":
            System.out.println("2");
            break;
            case "Black":
            System.out.println("3");
          
        }

    }
}