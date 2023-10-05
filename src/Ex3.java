public class Ex3 {
    public static void ex3(){
        System.out.println("Ex3: ");
        float S = 0;
        for(int i = 1;i < 100;i++){
            S += (float) i /(i+2);
            System.out.println(i);
            ++i;
        }
        System.out.println(S+"\n");
    }
}
