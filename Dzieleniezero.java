import java.util.Scanner;

public class Dzieleniezero{
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą którą podzielisz liczbę 100: ");
        int a = i.nextInt();
        if (a==0){
            System.out.println("Nie wolno dzielić przez 0");
        }
        else{
            System.out.println("Wynik to "+(100/a));
        };
    }
}