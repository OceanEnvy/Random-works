import java.util.Random;

public class Lett{
    public static void main(String[] args){
        Random radom = new Random();
        int num = 0;
        int i = 0;
        long timStart = System.nanoTime();
        for(i=0; i<16; i++){
            System.out.print((char)(radom.nextInt(26)+65));
        }
        long timStop = System.nanoTime();
        System.out.println();
        System.out.println("Czas działania: "+(timStop-timStart));
    }
}