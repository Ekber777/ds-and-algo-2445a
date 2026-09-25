package Problem14;
import java.util.Scanner;
public class Problem14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("n ededini daxil edin:  ");
        int n=sc.nextInt();
        int say=0;
        for (int i=1;i<=n;i++){
            if (i%2==0){
                say+=1;
            }
        }   
                    
        System.out.println("1-den"+n+"-e qeder cut ededlerin sayi:"+say);
        sc.close();

    }
}
            
    
