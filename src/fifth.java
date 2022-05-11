import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        String array[] = new String[2];
        for(int i = 0; i < 2; i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Введіть рядок: ");
            array[i] = sc.nextLine();
        }
        if(array[0].length() > array[1].length()) {
            System.out.println("Перший рядок більший за другий");
        }
        else if(array[0].length()==array[1].length()) {
            System.out.println("Перший рядок і другий однаковий");
        }
        else{
            System.out.println("Другий рядок більший за перший");
        }
    }
}
