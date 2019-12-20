package pazdziernik_26_27.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

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

    public void ad3(){

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\sele\\New folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.onet.pl/");
        String onetWebsite = driver.findElement(By.id("pageMainContainer")).getText();
        String[] wordsOnetWebsite = onetWebsite.split(" ");
        HashSet<String> wordsStartingWithJ = new HashSet<String>();
        for (String word:wordsOnetWebsite) {
            if (word.toLowerCase().startsWith("j")){
                System.out.println(word);
                wordsStartingWithJ.add(word);
            }
        }
    }

//            Zad.4.
//    Stwórz program, który użyje brute force'a w celu odgadnięcia hasła do formularza http://qualitycourses.pl/login (login: testy123). Podejrzałeś przez ramię jak kolega wpisuje hasło, natomiast po wprowadzeniu pierszych czterech znaków, kolega się pochylił zasłaniając klawiaturę. Wiesz natomiast, że pierwsze znaki to "test". Wypisz na ekran informację ile czasu zajęło "złamanie" hasła.
    public void ad4(){
        int counter = 0;
        final String ALPHA_UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String ALPHA_LOWER = "abcdefghijklmnopqrstuvwxyz";
        final String ALPHA_NUMERIC = "0123456789";
        final String ALPHA_SPECIAL = " !\"#$%&\'()*+,-./:;<=>?@[\\]^_`{|}~";
        char[]charset = (ALPHA_LOWER+ALPHA_UPPER+ALPHA_NUMERIC+ALPHA_SPECIAL).toCharArray();
        String pass = "test";


        while (true){
           String password = pass + charset[counter];
            System.out.println(password);
            counter++;

        }


    }



    public void ad5() {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\sele\\New folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String[] miastaPol = new String[]{"Warszawa", "Kraków", "Łódź", "Wrocław", "Poznań", "Gdańsk", "Szczecin", "Bydgoszcz", "Lublin", "Białystok"};
        HashMap<String, Integer> citiesInGoogle = new HashMap<String, Integer>();

        for (String miasto : miastaPol) {
            driver.get("https://www.google.com/search?sxsrf=ACYBGNTZvuBUQ3QdsYNpazMcAgyfctEYNQ%3A1576660384112&source=hp&ei" +
                    "=oO35XYHsBIzYmwW66oy4Dw&q=" + miasto + "&oq=" + miasto + "&gs_l=psy-ab.3..35i39l3j0i322i203j0i203l2j0i199i175i203j0i203l3" +
                    ".1431.2736..3115...2.0..0.150.1126.0j8....3..0....1..gws-wiz.....10..35i362i39j35i322i39j0j0i322j0i199i175" +
                    ".4R7ey2TbppE&ved=0ahUKEwiBvP_Q7b7mAhUM7KYKHTo1A_cQ4dUDCAY&uact=5");
            String textResults = driver.findElement(By.id("resultStats")).getText();
            Integer results = Integer.parseInt(textResults.substring(6,textResults.lastIndexOf(" w")).replace(" ",""));

            citiesInGoogle.put(miasto, results);
        }
        for (String key :citiesInGoogle.keySet()) {
            System.out.println(key+" - "+citiesInGoogle.get(key));
        }
        driver.close();
    }
    }
