import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int numOfInput = Integer.parseInt(stringTokenizer.nextToken());
        int count = Integer.parseInt(stringTokenizer.nextToken());

        long[] inputArray = new long[numOfInput];
        long[] sumArray = new long[numOfInput];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < numOfInput; i++) {
            inputArray[i] = Integer.parseInt(stringTokenizer.nextToken());

            if (i == 0) {
                sumArray[i] = inputArray[i];
                continue;
            }
            sumArray[i] = sumArray[i - 1] + inputArray[i];
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < count; j++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int startIndex = Integer.parseInt(stringTokenizer.nextToken()) - 1;
            int endIndex = Integer.parseInt(stringTokenizer.nextToken()) - 1;
            long result = sumArray[endIndex] - sumArray[startIndex] + inputArray[startIndex];

            stringBuilder.append(result).append("\n");
        }
        System.out.println(stringBuilder.toString());

        bufferedReader.close();
    }
}