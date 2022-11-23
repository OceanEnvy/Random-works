import java.util.Scanner;

public class Dom{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Napisz cokolwiek chcesz");
        String txt = sc.nextLine();

        System.out.println("Wpisany tekst jest długi na "+txt.length()+" znaków");
    }
}