package Problem16;
import java.util.Scanner;
public class Problem16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("n ededini daxil edin:...");
        int n=sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+(n*i));
        sc.close();
        
        }
    }
}