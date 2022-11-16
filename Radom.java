import java.util.Random;

public class Radom{
    public static void main(String[] args){
        Random r = new Random();
        int a = r.nextInt(101);
        int b = r.nextInt(101);
        if (a>b){
            System.out.println("System wylosował dwie liczby od 0 do 100, zmienna a czyli "+a+" jest większe od b czyli "+b);
        }
        else if (a==b){
            System.out.println("System wylosował dwie liczby i są one takie same czyli są liczbą "+a);
        }
        else{
            System.out.println("System wylosował dwie liczby od 0 do 100, zmienna b czyli "+b+" jest większe od b czyli "+a);
        };
    }
}