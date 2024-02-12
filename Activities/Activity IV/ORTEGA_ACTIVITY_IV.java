import java.util.Scanner;
public class ORTEGA_ACTIVITY_IV {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter color: ");
        String color = sc.nextLine();


        switch(color) {
            case "RED":
                System.out.println("1");
            break;
            case "GREEN":
                System.out.println("2");
            break;
            case "BLACK":
                System.out.println("3");
            break;
        }
    }
}
    

