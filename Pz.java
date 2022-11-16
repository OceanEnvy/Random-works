import java.util.Scanner;
import java.lang.Math;

public class Pz{
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.print("Podaj liczbę dodatnią lub ujemną: ");
        int a = i.nextInt();
        System.out.println(" ");
        System.out.print("Podaj liczbę o przeciwnym znaku do poprzedniej: ");
        int b = i.nextInt();
        System.out.println(" ");
        if (a==0){
            System.out.println("Jedna z podanych liczb jest zero albo obie liczby są dodatnie lub ujemne");
        }
        else if (b==0){
            System.out.println("Jedna z podanych liczb jest zero albo obie liczby są dodatnie lub ujemne");
        }
        else if (a<0 && b<0){
            System.out.println("Jedna z podanych liczb jest zero albo obie liczby są dodatnie lub ujemne");
        }
        else if (a>0 && b>0){
            System.out.println("Jedna z podanych liczb jest zero albo obie liczby są dodatnie lub ujemne");
        }
        else if (a>b){
            System.out.print("Pierwiastek liczby "+a+" to "+Math.sqrt(a));
        }
        else{
            System.out.println("Kwadrat liczby "+b+" to "+(b*b));
        };
    }
}