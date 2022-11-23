import java.util.Scanner;

public class Sub{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String ship = "I ship soukoku";

        System.out.println(ship);
        String now = ship.substring(7,14);

        System.out.print("What do you ship? ");

        String inp = sc.nextLine();
        

        if (inp.equals(now)){
            System.out.println("Oh, so you like soukoku too!");
        }
        else{
            System.out.println("I ship "+inp+" too now <3");
        }
    }
}