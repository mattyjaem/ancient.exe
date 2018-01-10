import java.util.Scanner;
public class Variables {
  public static void main (String [] args){
    Scanner scan = new Scanner (System.in);
      int num = 0;
      int num2 = 0;
      int num3 = 0;
      int num4 = 0;

      System.out.println("How Tall Is Your Wall??")
      num = scan.nextInt();

      System.out.println("How Wide Is Your Wall?")
      num2 = scan.nextInt();

      System.out.println("How much stuff do you not want to paint?")
      num3 = scan.nextInt();

      System.out.println("How many coats of paint do u want?")
      num4 = scan.nextInt();

      System.out.println("Heres how much paint u need");
        while (num > 0){
          System.out.println ((((num * num2)- num3) / num4 )/ 11);
  }

  }
}
