package Problem19;
import java.util.Scanner;
public class Problem19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Eded daxil et:...");
        int eded=sc.nextInt();
        int ters=0;
        while (eded>0){
            int sonreqem=eded%10;
            ters=ters*10+sonreqem;
            eded/=10;
        }


        System.out.println("Ededin tersi:"+ters);
        sc.close();

        
    }
}