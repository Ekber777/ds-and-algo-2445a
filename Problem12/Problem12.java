package Problem12;
import java.util.Scanner;
public class Problem12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Ededi daxil edin (1-4):   ");
        int eded=sc.nextInt();
        switch (eded){
            case 1:
                System.out.println("toplama");
                break;
            case 2:
                System.out.println("cixma");
                break;
            case 3:
                System.out.println("vurma");
                break;
            case 4:
                System.out.println("bolme");
                break;
            default:
                System.out.println("Bele eded yoxdur");
                break;
        }  
        sc.close();
        
    }
}