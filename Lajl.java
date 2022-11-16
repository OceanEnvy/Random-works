import java.util.*;

public class Lajl{
    public static void main(String[] args){
        System.out.println("zad. 1");
        System.out.println("");
        int j = 1;
        while (j <=10){
            System.out.print(j+" ");
            j++;
        }
        System.out.println("");
        System.out.println("");
        System.out.println("zad. 2");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("Wynik:");
        System.out.print("Podaj liczbę: ");
        int d = sc.nextInt();
        System.out.println("");
        while (d != 0){
            System.out.println("Podałeś "+d);
            System.out.print("Podaj liczbę: ");
            d = sc.nextInt();
            System.out.println("");
        }
        System.out.println("Dziękuję, to koniec.");
        System.out.println("");
        System.out.println("zad. 3");
        System.out.println("");
        System.out.println("Wynik:");
        System.out.println("Podaj dowolną liczbę, 0 - koniec programu.");
        int t = sc.nextInt();
        while (t != 0){
            if (t > 0){
                System.out.println("Pierwiastek z "+t+" to "+Math.sqrt(t));
            }
            else {
                System.out.println("Liczba "+t+" do potęgi drugiej to "+(t*t));
            }
            System.out.println("Podaj dowolną liczbę, 0 - koniec programu.");
            t = sc.nextInt();
        }
        System.out.println("Hasta la vista coder");
        System.out.println("");
        System.out.println("zad. 4");
        System.out.println("");
        int c = (int) (Math.random()*100+1);
        while (c != 20){
            System.out.println(c);
            c = (int) (Math.random()*100+1);
        }
        System.out.println(c);
        System.out.println("");
        System.out.println("zad. 5");
        System.out.println("");
        int[] tab = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int x = 0;
        System.out.print("Podaj liczbę: ");
        int p = sc.nextInt();
        tab[x] = p;
        System.out.println("");
        while (p > 0){
            x++;
            System.out.print("Podaj liczbę: ");
            p = sc.nextInt();
            tab[x] = p;
            System.out.println("");
        }
        x--;
        int y = 0;
        while (y <= x){
            System.out.print("Dla liczb: ");
            int srd = 0;
            for (y = 0; y <= x; y++){
                System.out.print(tab[y]+" ");
                srd += tab[y];
            }
            System.out.println("");
            System.out.println("średnia arytmetyczna to: "+(srd/x));
        }
    }
}