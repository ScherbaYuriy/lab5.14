
import java.util.Scanner;

public class second {
        public static void main(String[] args) {
            String[] letters = new String[5];
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                System.out.print("Введіть слово: ");
                letters[i] = sc.nextLine();
            }
            System.out.print(letters[0].substring(0, 1) + letters[1].substring(0, 1) + letters[2].substring(0, 1) + letters[3].substring(0, 1) + letters[4].substring(0, 1));

        }

    }

