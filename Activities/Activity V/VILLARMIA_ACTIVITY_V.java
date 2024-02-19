import java.util.Scanner;
     public class VILLARMIA_ACTIVITY_V{
     public static void main (String[] args){

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Age");
      int age = sc.nextInt();
      
      if (age >=0 && age <=11){
        System.out.println("Child");

      }
      else if (age >=0 && age <=17){
        System.out.println("Teen");

      }
      else if (age >=0 && age <=64){
            System.out.println("Adult");
      }
  }

     }


 