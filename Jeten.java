import java.util.Scanner;

public class Jeten{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int num = sc.nextInt();

        switch(num){
            case 2:{
                System.out.println("Podana liczba to 2");
                break;
            }
            case 3:{
                System.out.println("Podana liczba to 3");
                break;
            }
            default:{
                System.out.println("Podana liczba nie jest 2 lub 3");
            }
        }
    }
}