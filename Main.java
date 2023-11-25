import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        String[] game = {"Kağıt", "Taş", "Makas"};
        boolean check = true;
        System.out.println(ANSI_BLUE + "Hoşgeldin" + ANSI_RESET);
        while (check) {
            check = false;
            int rand = rm.nextInt(0,3);
            System.out.println("Taş / Kağıt / Makas");
            System.out.println(game[rand]);
            System.out.print("lütfen Birini Seçiniz : ");
            String select = sc.next();
            if ((select.equalsIgnoreCase("Taş") && game[rand].equals(game[0])) || (select.equalsIgnoreCase("Tas") && game[rand].equals(game[0]))) {
                System.out.println("Sen : " + select);
                System.out.println("Rakip : " + game[rand]);
                System.out.println(ANSI_RED + "Kaybettin!" + ANSI_RESET + "\n");
                check = true;
            } else if ((select.equalsIgnoreCase("Taş") && game[rand].equals(game[1])) || (select.equalsIgnoreCase("Tas") && game[rand].equals(game[1]))) {
                System.out.println("Sen : " + select);
                System.out.println("Rakip : " + game[rand]);
                System.out.println(ANSI_YELLOW + "Kazanan Olmadı!" + ANSI_RESET + "\n");
                check = true;
            } else if ((select.equalsIgnoreCase("Taş") && game[rand].equals(game[2])) || (select.equalsIgnoreCase("Tas") && game[rand].equals(game[2]))) {
                System.out.println("Sen : " + select);
                System.out.println("Rakip : " + game[rand]);
                System.out.println(ANSI_GREEN + "Kazandın" + ANSI_RESET + "\n");
                check = true;
            }

            else if ((select.equalsIgnoreCase("Kağıt") && game[rand].equals(game[0])) || (select.equalsIgnoreCase("Kagıt") && game[rand].equals(game[0]))) {
                System.out.println("Sen : " + select);
                System.out.println("Rakip : " + game[rand]);
                System.out.println(ANSI_YELLOW + "Kazanan Olmadı!" + ANSI_RESET + "\n");
                check = true;
            } else if (select.equalsIgnoreCase("Kağıt") && game[rand].equals(game[1]) || (select.equalsIgnoreCase("Kagıt") && game[rand].equals(game[1]))) {
                System.out.println("Sen : " + select);
                System.out.println("Rakip : " + game[rand]);
                System.out.println(ANSI_GREEN + "Kazandın" + ANSI_RESET + "\n");
                check = true;
            } else if (select.equalsIgnoreCase("Kağıt") && game[rand].equals(game[2]) || (select.equalsIgnoreCase("Kagıt") && game[rand].equals(game[2]))) {
                System.out.println("Sen : " + select);
                System.out.println("Rakip : " + game[rand]);
                System.out.println(ANSI_RED + "Kaybettin!" + ANSI_RESET + "\n");
                check = true;
            }

            else if (select.equalsIgnoreCase("Makas") && game[rand].equals(game[0])) {
                System.out.println("Sen : " + select);
                System.out.println("Rakip : " + game[rand]);
                System.out.println(ANSI_GREEN + "Kazandın" + ANSI_RESET + "\n");
                check = true;
            } else if (select.equalsIgnoreCase("Makas") && game[rand].equals(game[1])) {
                System.out.println("Sen : " + select);
                System.out.println("Rakip : " + game[rand]);
                System.out.println(ANSI_RED + "Kaybettin!" + ANSI_RESET + "\n");
                check = true;
            } else if (select.equalsIgnoreCase("Makas") && game[rand].equals(game[2])) {
                System.out.println("Sen : " + select);
                System.out.println("Rakip : " + game[rand]);
                System.out.println(ANSI_YELLOW + "Kazanan Olmadı!" + ANSI_RESET + "\n");
                check = true;
            }

            else {
                System.out.println(ANSI_RED + "Geçersiz Seçim" + ANSI_RESET + "\n");
                check = true;
            }
        }
        sc.close();
    }
}