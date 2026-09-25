package Problem2;
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Birinci ededi daxil et:...");
        int a=sc.nextInt();
        System.out.print("Ikinci ededi daxil et:...");
        int b=sc.nextInt();
        System.out.println("Cem: "+(a+b));
        System.out.println("Ferq:"+(a-b));
        System.out.println("Hasil: "+(a*b));
        System.out.println("Bolme: "+(a/b));
        System.out.println("Qaliq:"+(a%b));

        sc.close();
    }
}
