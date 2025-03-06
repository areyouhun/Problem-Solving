import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int count = 0;
        int start = 1;
        int end = 1;
        int sum = start;

        while (start <= N || end <= N) {
            if (sum < N) {
                end++;
                sum += end;
            } else if (sum > N) {
                sum -= start;
                start++;
            } else {
                count++;
                sum -= start;
                start++;
            }
        }
        System.out.println(count);
	}
}