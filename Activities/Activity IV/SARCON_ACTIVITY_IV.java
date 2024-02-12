import java.util.Scanner;
public class SARCON_ACTIVITY_IV.java { 

    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Red/Green/Black : ");
    String box = sc.nextLine();

    switch(box){
        case "Red":
            System.out.println(x: 1);
            break;
        case "Green":
            System.out.println(x: 2);
            break;
        case "Black":
            System.out.println(x: 3);
            break;
            default:
            System.out.println("Invalid choice. Please enter Red, Green, or Black");
        }
    }
}
