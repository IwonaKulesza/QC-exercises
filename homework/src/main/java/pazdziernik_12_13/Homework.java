package pazdziernik_12_13;

import java.util.Scanner;

public class Homework {


    public void ad1() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter password:");

        String password = scanner.nextLine();
        String reverse = "";

        if (password.length() >= 7 && checkForSpecialChars(password)) {
            for (int i = password.length() - 1; i >= 0; i--) {
                reverse = reverse + password.charAt(i);
            }
        }
        System.out.println(reverse);

    }

    private boolean checkForSpecialChars(String password) {
        boolean special = false;

        for (char character : password.toCharArray()) {
            if (!Character.isLetterOrDigit(character)) {
                special = true;
                break;
            }
        }
        return special;
    }

    public void ad2() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sentence:");

        String sentence = scanner.nextLine().toLowerCase().replace(" ", "");
        String reversedSentence = "";
        int counter = sentence.length() - 1;

        for (char letter : sentence.toCharArray()
        ) {
            reversedSentence = reversedSentence + letter;
            if (sentence.charAt(counter) != letter) {
                System.out.println("zdech");
                break;
            }
            counter--;
        }
        if (reversedSentence.equals(sentence)) {
            System.out.println("palindrom");
        }
    }

    public void ad3() {

    Scanner scanner = new Scanner(System.in);
    while (!pralka(scanner));
}

    private boolean pralka(Scanner scanner){

            System.out.println(
                    "1. pranie wstepne\n" +
                            "2. pranie\n" +
                            "3. plukanie\n" +
                            "4. wirowanie\n" +
                            "5. suszenie");

            int userChoice = scanner.nextInt();


            switch (userChoice) {
                case 1: {
                    System.out.println("pranie wstepne");
                    return true;
                }
                case 2: {
                    System.out.println("pranie");
                    return true;
                }
                case 3: {
                    System.out.println("plukanie");
                    return true;
                }
                case 4: {
                    System.out.println("wirowanie");
                    return true;
                }
                case 5: {
                    System.out.println("suszenie");
                    return true;
                }
                default: {
                    System.out.println("nawet pralkę źle programujesz, jeszcze raz\n");
                    return false;

                }
            }
        }

    public void ad4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("czy cyferki dej andżejku");
        int bok1 = scanner.nextInt();
        int bok2 = scanner.nextInt();
        int bok3 = scanner.nextInt();

        if (bok1+bok2>bok3){
            System.out.println("wow to ▲. Obwód: "+(bok1+bok2+bok3));
        }else{
            System.out.println("andżej to jebnie");
        }

    }
    public void ad5() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String gwiazdka = "";
            System.out.println("hohoho cyferkę pisz:");
            int userInput = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < userInput; i++) {
                gwiazdka = gwiazdka + "*";
                System.out.println(gwiazdka);
            }
        }
    }

//    Przerób zadanie #5 tak, aby można było rysować choinkę wielokrotnie bez ponownego uruchamiania programu oraz po wprowadzeniu liczby ujemnej, choinka rysowała się do góry nogami.
//
//    Przykład: *użytkownik wprowadził liczbę -4*
//    Wynik:
//            ****
//            ***
//            **
//            *
    public void ad6() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String gwiazdka = "";
            System.out.println("hohoho cyferkę pisz:");
            int userInput = Integer.parseInt(scanner.nextLine());

            if
            for (int i = 0; i < userInput; i++) {
                gwiazdka = gwiazdka + "*";
                System.out.println(gwiazdka);
            }

        }
    }

}







