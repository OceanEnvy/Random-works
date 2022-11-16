import java.util.Scanner;

public class Dzialanie{
    public static void main(String[] args){
        Scanner liczba = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę całkowitą: ");
        int l1 = liczba.nextInt();
        System.out.println(" ");
        System.out.print("Podaj drugą liczbę całkowitą: ");
        int l2 = liczba.nextInt();
        System.out.println(" ");
        System.out.println("Suma podanych liczb to: "+(l1+l2));
        System.out.println("Różnica podanych liczb to: "+(l1-l2));
        System.out.println("Iloczyn podanych liczb to: "+(l1*l2));
    }
}