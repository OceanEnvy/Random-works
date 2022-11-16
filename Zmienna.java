import java.util.Scanner;

public class Zmienna{
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int a = i.nextInt();
        if (a>0){
            System.out.println("Liczba zmiennej a jest większa od 0");
        }
        else if (a==0){
            System.out.println("Liczba zmiennej a to 0");
        }
        else{
            System.out.println("Liczba zmiennej a jest mniejsza od 0");
        };
    }
}