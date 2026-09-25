package Problem7;
import java.util.Scanner;
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Ededi daxil et:...");
        int a=sc.nextInt();
        if (a>0){
            System.out.println("Eded musbetdir");
        }else if (a<0){
            System.out.println("Eded menfidir");
        }else{
            System.out.println("Eded sifirdir");
        sc.close();

        }
    }
}
