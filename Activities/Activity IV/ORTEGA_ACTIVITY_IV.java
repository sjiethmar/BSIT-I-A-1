import java.util.Scanner;
public class ORTEGA_ACTIVITY_IV {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter color: ");
        String color = sc.nextLine();
        int red = 1, green = 2, black = 3;


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
    

