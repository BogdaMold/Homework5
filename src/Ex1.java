import java.util.Scanner;

public class Ex1 {

    public static void ex1(){
        System.out.println("Ex1: \n");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int S=0,p=0,n=0 ;

        while(a != 0){
            if(a > 0 ){
                System.out.println("Pozitiv: " + a);
                p++;
            }
            else {
                System.out.println("Negativ: " + a);
                n++;
            }
            S += a;
            a = scanner.nextInt();
        }
        System.out.println("Suma = " + S);
    }
}
