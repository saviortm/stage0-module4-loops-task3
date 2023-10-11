package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        int number = Math.abs(t);
        String str = Integer.toString(t);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
    }
}
