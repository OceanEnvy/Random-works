import java.util.Scanner;

public class CyfraJedenL{
    public static void main(String[] args){
        Scanner sce = new Scanner(System.in);

        System.out.print("Podaj cyfrę: ");
        int l = sce.nextInt();

        System.out.println("  "+l);
        System.out.println(" "+l+""+l);
        System.out.println(l+" "+l);
        System.out.println("  "+l);
        System.out.println(l+""+l+""+l+""+l+""+l);
    }
}