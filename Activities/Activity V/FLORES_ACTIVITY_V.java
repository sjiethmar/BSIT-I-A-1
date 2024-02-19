import java.util.Scanner;
public class FLORES_ACTIVITY_V {
    public static void main(String[]args){
    Scanner num= new Scanner(System.in);
    int age;

    System.out.print("Please Enter your Age: ");
    age = num.nextInt();

    if (age >=0 && age <= 11){
            System.out.println("Child");
        } else if (age >= 12 && age <= 17){
            System.out.println("Teen");
        } else if (age >= 18 && age <= 64){
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }

    }
}
