import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int sum = 0;
        int oldmodel = 0;
        while (sum <=9999);{
            System.out.println("enter a part number");
            int partnum =scan.nextInt();
            System.out.println("enter a part number");
            if ((partnum.length() != 4));
            {
                System.out.println("Error - please enter a 4 digit number");
            }; else{
                int sum = (partnum + sum);
            }
                if (partnum.endswith ("6" || "7" || "8")){
                    int oldmodel = oldmodel +1;
                    int total = total + 1;
                    System.out.println("This is an old model");

                }
            }
        }
        System.out.println("You have this number of old models:" +oldmodels);
        System.out.println("You have this number of models in total :" +total)
}
