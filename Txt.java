import java.util.Scanner;

public class Txt{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Napisz coś: ");
        String s = sc.nextLine();
        System.out.println(" ");
        if (s.length()>8){
            System.out.println("Otrzymałeś sekretny komunikat, brawo");
        };
    }
}