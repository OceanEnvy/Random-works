import java.util.Scanner;

public class Tabliczka{
    public static void main(String[] args){
        Scanner liczba = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int l = liczba.nextInt();
        System.out.println(" ");
        System.out.println("Tabliczka mnożenia od 1 do 10 podanej liczby to: ");
        System.out.println(" ");
        System.out.println(l+" * 1 = "+l);
        System.out.println(l+" * 2 = "+(l*2));
        System.out.println(l+" * 3 = "+(l*3));
        System.out.println(l+" * 4 = "+(l*4));
        System.out.println(l+" * 5 = "+(l*5));
        System.out.println(l+" * 6 = "+(l*6));
        System.out.println(l+" * 7 = "+(l*7));
        System.out.println(l+" * 8 = "+(l*8));
        System.out.println(l+" * 9 = "+(l*9));
        System.out.println(l+" * 10 = "+(l*10));
    }
}