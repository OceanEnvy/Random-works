import java.util.Scanner;

public class Domsub{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Napisz cokolwiek chcesz");
        String txt = sc.nextLine();

        if (txt.length()>=4){
            System.out.println(txt.substring(3,txt.length()));
        }

        System.out.println(txt.substring(0, 10));

        System.out.println("Podaj od miejsce litery od której wytnie tekst:");
        int start = sc.nextInt();

        System.out.println("Podaj od miejsce litery gdzie skończy wycinać tekst:");
        int end = sc.nextInt();

        if (start<0 && end>txt.length()){
            System.out.println(txt.substring(0, txt.length()));
        }
        else if (end>txt.length()){
            System.out.println(txt.substring(start, txt.length()));
        }
        else if (start<0){
            System.out.println(txt.substring(0, end));
        }
        else{
            System.out.println(txt.substring(start, end));
        }
    }
}