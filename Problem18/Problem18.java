package Problem18;
import java.util.Scanner;
public class Problem18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Eded daxil et:...");
        int eded=sc.nextInt();
        int say=0;
        if (eded==0){
            say=1;
        }else{
            if (eded<0){
                eded=-eded;

            }
            while (eded>0){
                eded/=10;
                say++;
            }    
            
            System.out.println("Ededin reqemlerinin sayi:"+say);
        sc.close();

            
        }

    }
}