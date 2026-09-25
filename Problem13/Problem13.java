package Problem13;
import java.util.Scanner;
public class Problem13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("n ededini daxil edin: ");
        int n=sc.nextInt();
        int cem=0;
        for (int i=1;i<=n;i++){
            cem+=i;
        System.out.println("1-den"+n+"-e qeder ededlerin cemi:"+cem);
        sc.close();
        }
    }
}