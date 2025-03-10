import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        int M = Integer.parseInt(bufferedReader.readLine());
        int[] uniqueNumbers = new int[N];

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            uniqueNumbers[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(uniqueNumbers);

        int count = 0;
        int leftIndex = 0;
        int rightIndex = uniqueNumbers.length - 1;

        while (leftIndex < rightIndex) {
            int sum = uniqueNumbers[leftIndex] + uniqueNumbers[rightIndex];

            if (sum < M) {
                leftIndex++;
            } else if (sum > M) {
                rightIndex--;
            } else {
                count++;
                leftIndex++;
                rightIndex--;
            }
        }
        System.out.println(count);
    }
}