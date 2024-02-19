import java.util.Scanner;

    public class ELEMINO_ACTIVITY_VI {
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter an Integer:");
            int sec = sc.nextInt();

            while(sec >= 0){
                System.out.println(sec);
                sec--;
            }
        }
    }