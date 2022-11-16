import java.util.Random;

public class Num{
    public static void main(String[] args){
        long timStart = System.nanoTime();
        Random radom = new Random();
        int num = 0;
        int i = 0;
        long timStop = System.nanoTime();

        System.out.println("Czas działania: "+(timStop-timStart));
        timStart = System.nanoTime();
        for(i=0; i<213700000; i++){
            num = radom.nextInt(2137)+1;
            System.out.println(num);
        }
        timStop = System.nanoTime();
        System.out.println("Czas działania: "+(timStop-timStart));
    }
}