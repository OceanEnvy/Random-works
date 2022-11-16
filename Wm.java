import java.util.Scanner;

public class Wm{
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę całkowitą: ");
        int a = i.nextInt();
        System.out.println(" ");
        System.out.print("Podaj drugą liczbę całkowitą: ");
        int b = i.nextInt();
        System.out.println(" ");
        if (a>b){
            System.out.println("Liczba "+a+" jest większa od liczby "+b);
        }
        else if (a==b){
            System.out.println("Podane liczby są takie same");
        }
        else{
            System.out.println("Liczba "+b+" jest większa od liczby "+a);
        };
    }
}