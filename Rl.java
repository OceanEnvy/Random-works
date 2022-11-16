import java.util.Scanner;

public class Rl{
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę całkowitą: ");
        int a = i.nextInt();
        System.out.println(" ");
        System.out.print("Podaj drugą liczbę całkowitą: ");
        int b = i.nextInt();
        System.out.println(" ");
        if (a-b>0){
            System.out.println("Różnica podanych liczb jest większa od 0");
        }
        else if (a-b==0){
            System.out.println("Różnica podanych liczb jest równa 0");
        }
        else{
            System.out.println("Różnica podanych liczb jest mniejsza od 0");
        };
    }
}