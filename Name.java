import java.util.Scanner;

public class Name{
    public static void main(String[] args){
        Scanner name = new Scanner(System.in);
        System.out.print("Podaj swoje imię: ");
        String nm = name.nextLine();
        System.out.println(" ");
        System.out.println("Witaj "+nm+".");
    }
}