package Problem9;
import java.util.Scanner;
public class Problem9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Bali daxil et (0-100):...");
        int bal=sc.nextInt();
        int qrup=bal/10;
        switch (qrup){
            case 10:
            case 9:
                System.out.println("Qiymet:A");
                break;
            case 8:
                System.out.println("Qiymet:B");
                break;
            case 7:
                System.out.println("Qiymet:C");
                break;
            default:
                System.out.println("Qiymet:D");
                break;
        }
         
        sc.close();
    }
}