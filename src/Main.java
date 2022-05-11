import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] words = new String[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            System.out.print("Введіть слово: ");
            words[i] = sc.nextLine();
        }
        System.out.print(words[0] + " ".concat(words[1]) + " ".concat(words[2]) + " ".concat(words[3]) + " ".concat(words[4]));
    }
}

