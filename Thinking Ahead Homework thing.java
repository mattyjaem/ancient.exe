import java.util.Arrays;
public class Main {
    public static int[] ListInt = new int[]{7,2,14,5,21,28};
    public static int[] divList = new int[ListInt.length];
    public static int x = 0;
    public static void main(String[] args) {
	task(ListInt, x, divList);
    }
    public static void task(int[] ListInt, int x, int[] divList){



        for (int i=0; i<ListInt.length; i++){
            if(ListInt[i] % 7 ==0){
                divList[x] = ListInt[i];
                x++;
            }
        }
        System.out.println(Arrays.toString(divList));
    }
}


