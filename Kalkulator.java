import java.util.Scanner;

public class Kalkulator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Witaj w kalkulatorze");
        System.out.println(" ");

        System.out.print("Podaj pierwszą liczbę: ");
        int a = sc.nextInt();
        System.out.println(" ");

        System.out.print("Podaj drugą liczbę: ");
        int b = sc.nextInt();
        System.out.println(" ");

        System.out.println("Podaj na jakim działaniu chcesz działać:");
        System.out.println("S - dodawanie");
        System.out.println("R - odejmowanie");
        System.out.println("M - mnożenie");
        System.out.println("D - dzielenie");
        String calc = sc.next();
        System.out.println(" ");

        if (calc.equals("S")){
            System.out.println(a+"+"+b+"="+(a+b));
        }
        else if (calc.equals("R")){
            System.out.println(a+"-"+b+"="+(a-b));
        }
        else if (calc.equals("M")){
            System.out.println(a+"*"+b+"="+(a*b));
        }
        else if (calc.equals("D")){
            System.out.println(a+"/"+b+"="+(a/b));
        }
        else {
            System.out.println("Nie wiem jakie mam wykonać działanie");
        }
    }
}