import java.util.Scanner;
public class JAYME_ACTIVITY_IV {
  public static void main (String[] args){
    Scanner sc = new Scanner (System.in)
    System.out.print("Enter color")
    String color = sc.nextLine();

switch (color){
  case yellow:
  System.out.println("Number 1");
  break;
  case black:
  System.out.println("Number 2");
  break;
  case blue:
  System.out.println("Number 3");
  break;
  default:
  System.out.println("None of the Above");
} 
  }
}
