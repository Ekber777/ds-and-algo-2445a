package Problem4;
import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Selsi derecesini daxil et:...");
        double selsi=sc.nextDouble();
        double farenheyt=(selsi*9/5)+32;
        System.out.println("Farenheyt derecesi:"+farenheyt);
        sc.close();

    }
}
