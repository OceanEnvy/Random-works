import java.util.Scanner;

public class Twa{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("CZY KOCHASZ CHUUYE NAKAHARE? ");
        String txt = sc.nextLine();

        switch(txt){
            case "TAK":{
                System.out.println("SUPER");
                break;
            }
            case "NIE":{
                System.out.println("SZKODA");
                break;
            }
            default:{
                System.out.println("O CO CHODZI?");
            }
        }
    }
}