package Problem6;
import java.util.Scanner;
public class Problem6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Birinci ededi daxil et:...");
        int eded1=sc.nextInt();
        System.out.print("Ikinci ededi daxil et:...");
        int eded2=sc.nextInt();
        System.out.print("Ucuncu ededi daxil et:...");
        int eded3=sc.nextInt();
        if (eded1>eded2 && eded1>eded3){
            System.out.println("En boyuk eded:"+eded1);
        }else if (eded2>eded1 && eded2>eded3){
            System.out.println("En boyuk eded:"+eded2);
        }else{
            System.out.println("En boyuk eded:"+eded3);
        sc.close();
        
        }
    }
}
