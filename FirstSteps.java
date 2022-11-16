import java.util.Scanner;

public class FirstSteps{
    public static void main(String[] args){
        Scanner sce = new Scanner(System.in);

        System.out.print("Podaj liczbę C: ");
        int C = sce.nextInt();
        System.out.print("Podaj liczbę D: ");
        int D = sce.nextInt();

        System.out.println(C+"+"+D+"="+(C+D));
        System.out.println(C+"-"+D+"="+(C-D));
        System.out.println(C+"*"+D+"="+(C*D));
        System.out.println(C+":"+D+"="+(C/D));

        System.out.println("Bonus: "+C+" do kwadratu to "+(C*C));
        System.out.println("a "+D+" do sześcianu to "+(D*D*D));
    }
}