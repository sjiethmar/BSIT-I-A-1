import java.util.Scanner;
public class IPILI_IRISH_ACTIVITY_IV{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter color:");
    String robot = sc.nextLine();


    switch(robot) {
        case "RED":
        System.out.println("Number 1");
        break;
        case "GREEN":
        System.out.println("number 2");
        break;
        case "BLACK":
        System.out.println("Number 3");
        break;
        default:
        System.out.print("Nothing");
    }


    }
    
