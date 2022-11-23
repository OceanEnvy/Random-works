import java.util.Scanner;

public class Con{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj swoje imię:");
        String fname = sc.nextLine();

        System.out.println("Podaj swoje nazwisko:");
        String lname = sc.nextLine();

        System.out.println("Podaj swój wiek:");
        int age = sc.nextInt();

        System.out.println("Podaj swoją wagę:");
        int weight = sc.nextInt();

        System.out.println("Podaj swój wzrost (w metrach):");
        double height = sc.nextDouble();

        double BMI = weight/(height*height);

        if (BMI>10 && BMI<=20){
            System.out.println("Twoja waga jest prawidłowa");
        }
        else{
            System.out.println("Twoja waga jest nieprawidłowa");
        }
    }
}