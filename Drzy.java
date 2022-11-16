import java.util.Scanner;

public class Drzy{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Witaj w grze 'odnajdź się w labiryncie'!");
        System.out.println("");
        System.out.println("Pogram będzie ci zadawał pytanie w którą stronę chcesz iść.");
        System.out.println("L - skręć w lewo");
        System.out.println("P - skręć w prawo");
        System.out.println("N - idź naprzód");
        System.out.println("");
        System.out.println("Aby wygrać musisz pójść w dobrą stronę 10 razy z rzędu.");
        System.out.println("Powodzenia!");
        System.out.println("");
        System.out.print("Lewy korytarz nie wydaje w sobie mieć cokolwiek. ");
        System.out.print("Prawy korytarz wydaje się być zapchany winoroślami. ");
        System.out.print("Środkowy korytarz świeci się jakby było tam jakieś ognisko.");
        System.out.println("");
        System.out.println("W którą stronę chcesz iść?");
        String t1 = sc.nextLine();
        System.out.println("");


        switch(t1){
            case "L":{
                System.out.println("Udałeś się w lewo.");
                System.out.println("");
                System.out.print("W korytarzu po lewej wydaje ci się jakby się coś wiło. ");
                System.out.print("W korytarzu po prawej widzisz świetliki. ");
                System.out.print("W korytarzy naprzód nic nie widzisz.");
                System.out.println("");
                System.out.println("W którą stronę chcesz iść?");
                String t2 = sc.nextLine();
                System.out.println("");
                switch(t2){
                    case "N":{
                        System.out.println("Udałeś się do przodu.");
                        System.out.println("");
                        System.out.print("W korytarzu po lewej słyszysz czyjś śmiech. ");
                        System.out.print("W korytarzu po prawej słyszysz chmarę much. ");
                        System.out.print("W korytarzu naprzód nic nie słyszysz.");
                        System.out.println("");
                        System.out.println("W którą stronę chcesz iść?");
                        String t3 = sc.nextLine();
                        System.out.println("");

                        switch(t3){
                            case "N":{
                                System.out.println("Udałeś się do przodu.");
                                System.out.println("");
                                System.out.print("W korytarzu po lewej widzisz koniczynę. ");
                                System.out.print("W korytarzu po prawej słychać warknięcia. ");
                                System.out.print("W korytarzu naprzód nic nie widzisz.");
                                System.out.println("");
                                System.out.println("W którą stronę chcesz iść?");
                                String t4 = sc.nextLine();
                                System.out.println("");

                                switch(t4){
                                    case "L":{
                                        System.out.println("Udałeś się w lewo.");
                                        System.out.println("");
                                        System.out.print("W korytarzu po lewej słyszysz kroki. ");
                                        System.out.print("W korytarzu po prawej widzisz motyla. ");
                                        System.out.print("W korytarzu naprzód widzisz pochodnię.");
                                        System.out.println("");
                                        System.out.println("W którą stronę chcesz iść?");
                                        String t5 = sc.nextLine();
                                        System.out.println("");
                                
                                        switch(t5){
                                            case "P":{
                                                System.out.println("Udałeś się w prawo.");
                                                System.out.println("");
                                                System.out.print("W korytarzu po lewej słyszysz pokapującą wodę. ");
                                                System.out.print("W korytarzu po prawej wydaje ci się że coś na ciebie patrzy. ");
                                                System.out.print("W korytarzu naprzód widzisz grzyby.");
                                                System.out.println("");
                                                System.out.println("W którą stronę chcesz iść?");
                                                String t6 = sc.nextLine();
                                                System.out.println("");
                                
                                                switch(t6){
                                                    case "L":{
                                                        System.out.println("Udałeś się w lewo.");
                                                        System.out.println("");
                                                        System.out.print("Korytarz po lewej ma szczury. ");
                                                        System.out.print("Z korytarzu po prawej słyszysz ćwierki ptaka. ");
                                                        System.out.print("Korytarz naprzód wydaje się świecić na zielono.");
                                                        System.out.println("");
                                                        System.out.println("W którą stronę chcesz iść?");
                                                        String t7 = sc.nextLine();
                                                        System.out.println("");
                                
                                                        switch(t7){
                                                            case "P":{
                                                                System.out.println("Udałeś się w prawo.");
                                                                System.out.println("");
                                                                System.out.print("Korytarz na lewo ma mrówki. ");
                                                                System.out.print("Korytarz po prawej ma mnóstwo mchu. ");
                                                                System.out.print("Korytarz naprzód jest w czerwonych plamach.");
                                                                System.out.println("");
                                                                System.out.println("W którą stronę chcesz iść?");
                                                                String t8 = sc.nextLine();
                                                                System.out.println("");
                                
                                                                switch(t8){
                                                                    case "L":{
                                                                        System.out.println("Udałeś się w lewo.");
                                                                        System.out.println("");
                                                                        System.out.print("Korytarz na lewo wydaje się być oświetlony. ");
                                                                        System.out.print("Korytarz na prawo nic w sobie nie ma. ");
                                                                        System.out.print("Korytarz przed tobą jest pełen kości.");
                                                                        System.out.println("");
                                                                        System.out.println("W którą stronę chcesz iść?");
                                                                        String t9 = sc.nextLine();
                                                                        System.out.println("");
                                
                                                                        switch(t9){
                                                                            case "L":{
                                                                                System.out.println("Udałeś się w lewo.");
                                                                                System.out.println("");
                                                                                System.out.print("W korytarzu naprzód widzisz wyjście.");
                                                                                System.out.println("");
                                                                                System.out.println("W którą stronę chcesz iść?");
                                                                                String t10 = sc.nextLine();
                                                                                System.out.println("");
                                
                                                                                switch(t10){
                                                                                    case "N":{
                                                                                        System.out.println("Poszłeś do przodu");
                                                                                        System.out.println("");
                                                                                        System.out.println("Brawo odkrywco! Wydostałeś się z labiryntu!");
                                                                                        break;
                                                                                    }
                                                                                    default:{
                                                                                        System.out.println("Zgubiłeś się na dobre i grupa poszukiwawcza odnalazła cię po latach!");
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            default:{
                                                                                System.out.println("Zgubiłeś się na dobre i grupa poszukiwawcza odnalazła cię po latach!");
                                                                            }
                                                                        }
                                                                        break;
                                                                    }
                                                                    default:{
                                                                        System.out.println("Zgubiłeś się na dobre i grupa poszukiwawcza odnalazła cię po latach!");
                                                                    }
                                                                }
                                                                break;
                                                            }
                                                            default:{
                                                                System.out.println("Zgubiłeś się na dobre i grupa poszukiwawcza odnalazła cię po latach!");
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    default:{
                                                        System.out.println("Zgubiłeś się na dobre i grupa poszukiwawcza odnalazła cię po latach!");
                                                    }
                                                }
                                                break;
                                            }
                                            default:{
                                                System.out.println("Zgubiłeś się na dobre i grupa poszukiwawcza odnalazła cię po latach!");
                                            }
                                        }
                                        break;
                                    }
                                    default:{
                                        System.out.println("Zgubiłeś się na dobre i grupa poszukiwawcza odnalazła cię po latach!");
                                    }
                                }
                                break;
                            }
                            default:{
                                System.out.println("Zgubiłeś się na dobre i grupa poszukiwawcza odnalazła cię po latach!");
                            }
                        }
                        break;
                    }
                    default:{
                        System.out.println("Zgubiłeś się na dobre i grupa poszukiwawcza odnalazła cię po latach!");
                    }
                }
                break;
            }
            default:{
                System.out.println("Zgubiłeś się na dobre i grupa poszukiwawcza odnalazła cię po latach!");
            }
        }
    }
}