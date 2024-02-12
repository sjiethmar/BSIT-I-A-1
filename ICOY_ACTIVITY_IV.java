import java.util.scanner;

public class ICOY_ACTIVITY_IV.java{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER COLOR:");
        String robot = sc.nextline();

        switch(robot){
            case "RED":
                System.out.println("NUMBER 1");
            case "GREEN":
                System.out.println("NUMBER 2");
            case "BLACK":
                System.out.println("NUMBER 3");
            break;
            default:
            System.out.print("Nothing");
        }
    }
}