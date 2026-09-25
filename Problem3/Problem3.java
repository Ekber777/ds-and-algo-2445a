package Problem3;
import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Meblegi daxil et:...");
        double mebleg=sc.nextDouble();
        System.out.print("Faiz derecesini daxil et:...");
        double faiz=sc.nextDouble();
        double faizMeblegi=(mebleg*faiz)/100;
        System.out.println("Faizin meblegi:"+faizMeblegi);
        sc.close();

    }
}
