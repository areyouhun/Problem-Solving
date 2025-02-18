import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int range = Integer.parseInt(scanner.nextLine());
        String[] numbers = scanner.nextLine().split("");
        int sum = 0;

        for (int i = 0; i < range; i++) {
            sum += Integer.parseInt(numbers[i]);
        }

        System.out.println(sum); 
    }
}