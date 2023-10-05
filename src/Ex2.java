public class Ex2 {
    public static void ex2(){
        int k=0;
        System.out.println("Ex2: ");
        for(int i = 100; i<1000;i++){
            if(i%5 == 0 && i%6 == 0){
                System.out.print(i + " ");
                k++;
                if(k%10 == 0){
                    System.out.println("\n");
                }
            }
        }
    }
}
