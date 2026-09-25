package Problem8;
import java.util.Scanner;
public class Problem8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Yasi daxil et:...");
        int yas=sc.nextInt();
        if (yas>=18){
            System.out.println("Yetkin");
        }else if (yas>=0 && yas<=12){
            System.out.println("Usaq");
        }else{
            System.out.println("Yeniyetme");
        sc.close();
        
        }
    }
}
