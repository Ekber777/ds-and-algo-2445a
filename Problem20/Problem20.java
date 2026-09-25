package Problem20;
import java.util.Scanner;
public class Problem20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Ededi daxil et:...");
        int eded=sc.nextInt();
        int cem=0;
        while (eded>0){
            int sonreqem=eded%10;
            cem+=sonreqem;
            eded/=10;

        }
        System.out.println("Ededin reqemlerinin cemi:"+cem);
        sc.close();
    }
}