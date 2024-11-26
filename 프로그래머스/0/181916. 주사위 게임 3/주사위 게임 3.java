import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] numbers = {a, b, c, d};
        Arrays.sort(numbers);
        
        if (numbers[0] == numbers[3]) {
            return 1111 * a;
        }
        
        if (numbers[0] == numbers[2]) {
            return (int) Math.pow((10 * numbers[0] + numbers[3]), 2);
        }
        
        if (numbers[1] == numbers[3]) {
            return (int) Math.pow((10 * numbers[1] + numbers[0]), 2);
        }
        
        if (numbers[0] == numbers[1] && numbers[2] == numbers[3]) {
            return (numbers[1] + numbers[2]) * Math.abs(numbers[1] - numbers[2]);
        }
        
        if (numbers[0] == numbers[1]) {
            return numbers[2] * numbers[3];
        }
        
        if (numbers[1] == numbers[2]) {
            return numbers[0] * numbers[3];
        }
        
        if (numbers[2] == numbers[3]) {
            return numbers[0] * numbers[1];
        }
        
        return numbers[0];
    }
}