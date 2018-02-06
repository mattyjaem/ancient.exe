import java.util.stream.*; //imports java string utilities
import java.util.Scanner;
public class lessonwork2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

int i=0
//this is a pretty bad thing, please do not pay much attention. I am not quite sure what it does. the RegrEx is cool tho.
while i<3;{
  System.out.println("enter test scores for test1 seperated by a comma");
  String str =scan.nextInt();
  String res = str.split("\\s*[a-zA-Z]+\\s*");
  int sum = IntStream.of(res).sum();
  int average = sum/ 30;
  System.out.println("The average for test1 is" + average);
  int totalav = totalav + average;
  i++
}
int yearaverage = totalav / 30;
System.out.println ("The average for the year is" + yearaverage);

}
}
