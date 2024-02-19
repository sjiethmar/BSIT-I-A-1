import java.util.Scanner;
public class ORTEGA_ACTIVITY_V {
public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Enter your age: ");
        age = sc.nextInt();

        if(age >=0 && age <= 11){
            System.out.println("Child");
        }
        else if(age >= 12 && age <=17){
            System.out.print("Teen");
        }
        else if (age >= 18 && age <=64){
            System.out.println("Adult");
        }
    }
}