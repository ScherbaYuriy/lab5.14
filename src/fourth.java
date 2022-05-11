import java.util.Scanner;

public class fourth{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String names1, names2;
        System.out.println("Введіть два іменні:");
        names1 = scanner.nextLine();
        names2 = scanner.nextLine();
        if (names1.equalsIgnoreCase(names2)) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}