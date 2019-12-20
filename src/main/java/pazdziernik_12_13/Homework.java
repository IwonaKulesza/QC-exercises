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

    public void ad6() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("hohoho cyferkę pisz:");
            int userInput = Integer.parseInt(scanner.nextLine());
            int startLoop = 0;
            int endLoop=0;
            System.out.println("input = "+userInput);

            if (userInput>0){
                endLoop = userInput;
            }else {
                startLoop = userInput-1;
            }

            while (startLoop<endLoop){
                startLoop++;
                int gwiazdki = Math.abs(startLoop);
                for (int z = 0; z<gwiazdki; z++){
                    System.out.print("*");
                }
                System.out.print("\n");
            }

        }
    }

    public void ad7(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "1. dodawanie\n2. odejmowanie\n3. mnozenie\n4. dzielenie\n5. potegowanie");

        int userChoice = scanner.nextInt();
        System.out.println("co klyjentowy policzyć?");
        double userNumber1 = scanner.nextDouble();
        double userNumber2 = scanner.nextDouble();

        switch (userChoice){
            case 1:{
                System.out.println(userNumber1+"+"+userNumber2+"="+(userNumber1+userNumber2));
                break; }
            case 2:{
                System.out.println(userNumber1+"-"+userNumber2+"="+(userNumber1-userNumber2));
                break;}
            case 3:{
                System.out.println(userNumber1+"x"+userNumber2+"="+(userNumber1*userNumber2));
                break;}
            case 4:{
                System.out.println(userNumber1+"/"+userNumber2+"="+(userNumber1/userNumber2));
                break;}
            case 5:{
                System.out.println(userNumber1+" do potęgi "+userNumber2+"="+Math.pow(userNumber1,userNumber2));
                break;}
            default:{
                System.out.println("no nie bardzo");
                break;
            }

        }
    }

}







