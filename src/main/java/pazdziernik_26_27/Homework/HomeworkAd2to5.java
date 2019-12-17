package pazdziernik_26_27.Homework;

import java.util.Scanner;
import java.util.TreeSet;

public class HomeworkAd2to5 {

    public void ad2() {
        TreeSet<String> imiona = new TreeSet<String>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Gimme name");
            String imie = scanner.nextLine();
            if (imie.trim().toLowerCase().equals("koniec")) {
                break;
            }
            imiona.add(imie);
        }
        System.out.println(imiona);
    }
    //    Zad.3.
//    Stwórz program, który otworzy stronę www.onet.pl, znajdzie wszystkie wyrazy zaczynające się na literę "j" (case insensitive!) i wypisze je na ekranie. Skorzystaj z takiej kolekcji, która zagwarantuje unikalność elementów.
//
    public void ad3(){

    }

//            Zad.4.
//    Stwórz program, który użyje brute force'a w celu odgadnięcia hasła do formularza http://qualitycourses.pl/login (login: testy123). Podejrzałeś przez ramię jak kolega wpisuje hasło, natomiast po wprowadzeniu pierszych czterech znaków, kolega się pochylił zasłaniając klawiaturę. Wiesz natomiast, że pierwsze znaki to "test". Wypisz na ekran informację ile czasu zajęło "złamanie" hasła.
//
//    Zad.5.
//    Stórz mapę {String, Integer} i zainicjuj klucze nazwami 10 popularnych miast polskich. Następnie napisz program, który wyszuka każde miasto w google i zapisze obok miasta wartość równią liczbie trafień w Google.
//    Następnie wyświetl na konsoli zestawienie:
//    NazwaMiasta1 - liczbaTrafień
//    NazwaMiasta2 - liczbaTrafień
//            .
//.
//    NazwaMiasta10 - liczbaTrafień


}