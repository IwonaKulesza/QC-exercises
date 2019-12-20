package pazdziernik_26_27;

import java.util.Random;
import java.util.Scanner;

public class Zadania {

    public void scannerGettingUserInput() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi darling, what do we call ya?");
        System.out.println("Hello " + scanner.nextLine());

    }

    public void firstCalculator() {
        System.out.println("Gibe two numbers boyo");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("sum of "+a+" and "+b+" is "+(a+b));
    }

    public void constatnt(){
        final double PI = 3.14159265358979323846;
        System.out.println("Elo, poczebujemy promienia.");
        Scanner scanner = new Scanner(System.in);
        double promien = scanner.nextDouble();
        System.out.println("pole koła: "+2*PI*promien +"cm2");
    }

    public void string() {

//        Task 1: Compare two Strings and print boolean value:
//        Task 2: Fix code1 and compare them one more time.

        String code1 = "tajneHaslo123 ";
        String code2 = "tajneHaslo123";

        boolean comaparision = code1.trim().equals(code2.trim());


//        Task 3. Read the word and print its length.

        System.out.println("Lenght of word: " + code2 + " is" + code2.length());

//         Task 4. Read the word and print its last 2 digits.

        System.out.println("Last two digit of word: " + code2 + " is" + code2.substring(code2.length() - 2));

//         Task 5. Read the word, change the last letter to “x” and print it for 3 times.

        for (int i = 0; i < 3; i++) {
            System.out.println(code2.replace(code2.charAt(code2.length()), 'x'));
        }

//          Task 6. Read the word and change it to lower case, then print it.
        System.out.println(code2.toLowerCase());
    }

    public void prinf(){

        System.out.printf("Hi, my name is Zbyszek. I am %d years old and I am %d tall.\n", 6, 120);
        System.out.printf("Hi, my name is Zbyszek. I am %6d years old and I am %2d tall.\n", 6, 120);
        System.out.printf("PI value is %-10.3f Nice, right?%n", Math.PI);

        Random random = new Random();
        String[] names = {"mario", "luigi", "peach", "wario", "bowser"};

        for (int i = 0; i<5; i++){
            System.out.printf("Day number %d %s is washing the dishes %n",random.nextInt(364)+1,names[i]);
        }
    }

    public void averageNumberCalculator(){

        //Ask user for 3 integral numbers and print the average value. The result should
        //have 2 decimal places

        Scanner scanner = new Scanner(System.in);
        System.out.println("gimmme 3 ints");
        float average = (scanner.nextInt()+scanner.nextInt()+scanner.nextInt())/3;
        System.out.printf("%.2f",average);

    }

    public void incrementing(){
        //Task 1.
        //Ask user for integral number and print it incremented by 1.

        Scanner scanner = new Scanner(System.in);
        System.out.println("gimmme int");
        int incr = scanner.nextInt();
        System.out.println(++incr);

        //Task 2.
        //Ask user for integral number and print it decremented by 5.
        System.out.println("gimmme int");
        int decr = scanner.nextInt();
        System.out.println(decr-5);
    }

    }

