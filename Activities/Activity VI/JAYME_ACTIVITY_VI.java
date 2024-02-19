 import java.util.Scanner;

public class JAYME_ACTIVITY_VI {
  public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
     int seconds = sc.nextInt();

    int second = 0;
    int num = 0;
    while (num >= 10) {
      second -= num;
      num --;
      System.out.println(num);
    }

}
}
