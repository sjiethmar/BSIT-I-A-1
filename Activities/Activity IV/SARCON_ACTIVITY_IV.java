import java.util.Scanner;
public class MyClass { 
    
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
        }
    }
}
