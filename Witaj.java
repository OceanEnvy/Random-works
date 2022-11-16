import java.util.Scanner;

public class Witaj{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj swoje imię: ");
        String name = sc.nextLine();
        System.out.println(" ");
        System.out.println("Witaj "+name);
    }
}