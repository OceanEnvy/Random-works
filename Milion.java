import java.util.Scanner;

public class Milion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj swoje imię: ");
        String name = sc.nextLine();
        System.out.println(" ");
        System.out.println("Witaj w grze milionerzy "+name+"!");
        System.out.println(" ");
        System.out.println("Zadam ci 10 pytań zamkniętych, aby podać swoją odpowiedź będziesz musiał wpisywać A, B, C lub D");
        System.out.println("Życzę ci powodzenia "+name+"!");
        System.out.println(" ");

        System.out.println("1. Ile lat ma Chuuya Nakahara z BSD?");
        System.out.println(">  A - 21");
        System.out.println(">  B - 24");
        System.out.println(">  C - 22");
        System.out.println(">  D - 20");
        String one = sc.nextLine();
        System.out.println(" ");

        System.out.println("2. Co jest ulubionym daniem Atsushiego z BSD?");
        System.out.println(">  A - Mochi");
        System.out.println(">  B - Zupa miso");
        System.out.println(">  C - Chazuke");
        System.out.println(">  D - Tofu");
        String two = sc.nextLine();
        System.out.println(" ");

        System.out.println("3. W którym miesiącu którego roku wyjdzie 4 sezon BSD?");
        System.out.println(">  A - Kwiercień 2023");
        System.out.println(">  B - Grudzień 2022");
        System.out.println(">  C - Styczeń 2023");
        System.out.println(">  D - Luty 2023");
        String three = sc.nextLine();
        System.out.println(" ");

        System.out.println("4. Która postać z BSD spowodowała powstanie kultu po pojawieniu się w trailerze 4 sezonu?");
        System.out.println(">  A - Nikolai");
        System.out.println(">  B - Dazai");
        System.out.println(">  C - Chuuya");
        System.out.println(">  D - Odasaku");
        String four = sc.nextLine();
        System.out.println(" ");

        System.out.println("5. Który ship z BSD jest najpopularniejszy na AO3?");
        System.out.println(">  A - Atsushi x Akutagawa");
        System.out.println(">  B - Yosano x Kouyo");
        System.out.println(">  C - Dazai x Chuuya");
        System.out.println(">  D - Ranpo x Poe");
        String five = sc.nextLine();
        System.out.println(" ");

        System.out.println("6. Jaki jest najczęstszy hc seksualności Chuuyi?");
        System.out.println(">  A - Bi");
        System.out.println(">  B - Ace");
        System.out.println(">  C - Gej");
        System.out.println(">  D - Hetero");
        String six = sc.nextLine();
        System.out.println(" ");

        System.out.println("7. Która z odpowiedzi NIE jest prawdziwym talentem w BSD?");
        System.out.println(">  A - Upon the tainted sorrow");
        System.out.println(">  B - Crime and Punishment");
        System.out.println(">  C - Once upon a time");
        System.out.println(">  D - Dual Sexualis");
        String seven = sc.nextLine();
        System.out.println(" ");
        
        System.out.println("8. Które z podanych jest oficjalnym spin offem BSD?");
        System.out.println(">  A - Bungou Stray Dogs APPLE");
        System.out.println(">  B - Bungou Stray Cats");
        System.out.println(">  C - Bungou Stray Dogs BEAST");
        System.out.println(">  D - Bungou Stray Dogs 1865");
        String eight = sc.nextLine();
        System.out.println(" ");

        System.out.println("9. Jak się nazywa dyrektor sierocińca z BSD?");
        System.out.println(">  A - Clemont Hashira");
        System.out.println(">  B - Hiroshi Sato");
        System.out.println(">  C - Nigdy nie podano jego imienia");
        System.out.println(">  D - Kafka Asagiri");
        String nine = sc.nextLine();
        System.out.println(" ");

        System.out.println("10. W którym tomie mangi Chuuya się pojawia poraz pierwszy?");
        System.out.println(">  A - Trzecim");
        System.out.println(">  B - Szóstym");
        System.out.println(">  C - Czwartym");
        System.out.println(">  D - Siódmym");
        String ten = sc.nextLine();
        System.out.println(" ");

        int points = 0;

        if(one.equals("C")){
            points++;
        }
        if(two.equals("C")){
            points++;
        }
        if(three.equals("C")){
            points++;
        }
        if(four.equals("C")){
            points++;
        }
        if(five.equals("C")){
            points++;
        }
        if(six.equals("C")){
            points++;
        }
        if(seven.equals("C")){
            points++;
        }
        if(eight.equals("C")){
            points++;
        }
        if(nine.equals("C")){
            points++;
        }
        if(ten.equals("A")){
            points++;
        }


        switch(points){
        case 0:{
            System.out.println("Zdobyłeś "+points+" punktów");
            System.out.println("Czy się w ogóle starałeś "+name+"?");
            break;
        }
        case 1:{
            System.out.println("Zdobyłeś "+points+" punkt");
            System.out.println("Czy się w ogóle starałeś "+name+"?");
            break;
        }
        case 2<=points && points<=3:{
            System.out.println("Zdobyłeś "+points+" punkty");
            System.out.println("Czy się w ogóle starałeś "+name+"?");
            break;
        }
        case points==4:{
            System.out.println("Zdobyłeś "+points+" punkty");
            System.out.println("Ewidentnie znasz się na BSD "+name+" ale raczej tylko powierzchniowo");
            break;
        }
        case 5<=points && points<=8:{
            System.out.println("Zdobyłeś "+points+" punktów");
            System.out.println("Ewidentnie znasz się na BSD "+name+" ale raczej tylko powierzchniowo");
            break;
        }
        case points>=9:{
            System.out.println("Zdobyłeś "+points+" punktów!");
            System.out.println("Znasz się na rzeczy "+name+"!");
            break;
        }
        }
    }
}