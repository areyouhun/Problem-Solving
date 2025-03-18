import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static final char[] DNA = {'A', 'C', 'G', 'T'};
    private static int checkedNumber; // DNA.length가 돼야 조건 만족하고 카운팅

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        // 첫째 줄
        int S = Integer.parseInt(stringTokenizer.nextToken());
        int P = Integer.parseInt(stringTokenizer.nextToken());
        int count = 0;

        // 둘째 줄
        char[] fullString = bufferedReader.readLine().toCharArray();
        int[] currNumOfSubstring = new int[DNA.length];
        int[] minNumOfDNA = new int[DNA.length];

        // 셋째 줄
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < DNA.length; i++) {
            minNumOfDNA[i] = Integer.parseInt(stringTokenizer.nextToken());

            if (minNumOfDNA[i] == 0) {
                checkedNumber++; // 최소 개수가 0이므로 통과했다고 가정
            }
        }

        // 1. 부분 문자열 초기화
        for (int i = 0; i < P; i++) {
            add(fullString[i], currNumOfSubstring, minNumOfDNA);
        }

        // 부분 문자열 초기화한 뒤 조건 만족하면 카운팅
        if (checkedNumber == DNA.length) {
            count++;
        }

        // 2. 슬라이딩 윈도우 (j는 시작점, i는 끝점)
        // 1에서 검사 한 번한 셈이니 한 칸 이동한 상태부터 검사
        for (int i = 1; i <= S - P; i++) {
            remove(fullString[i - 1], currNumOfSubstring, minNumOfDNA);
            add(fullString[i + P - 1], currNumOfSubstring, minNumOfDNA);

            if (checkedNumber == DNA.length) {
                count++;
            }
        }

        System.out.println(count);

        bufferedReader.close();
    }

    private static void add(char letter, int[] currNumOfSubstring, int[] minNumOfDNA) {
        for (int i = 0; i < DNA.length; i++) {
            if (DNA[i] == letter) {
                currNumOfSubstring[i]++;
                if (currNumOfSubstring[i] == minNumOfDNA[i]) {
                    checkedNumber++;
                }
                break;
            }
        }
    }

    private static void remove(char letter, int[] currNumOfSubstring, int[] minNumOfDNA) {
        for (int i = 0; i < DNA.length; i++) {
            if (DNA[i] == letter) {
                if (currNumOfSubstring[i] == minNumOfDNA[i]) {
                    checkedNumber--;
                }
                currNumOfSubstring[i]--;
                break;
            }
        }
    }
}