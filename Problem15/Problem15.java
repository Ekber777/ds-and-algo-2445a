package Problem15;
import java.util.Scanner;
public class Problem15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("n ededini daxil edin: ");
        int n=sc.nextInt();
        long hasil=1;
        for (int i=1;i<=n;i++){
            hasil*=i;

        }
    

        System.out.println("1-den "+n+"-e qeder ededlerin hasili:"+hasil);
        sc.close();

        
    }
}
