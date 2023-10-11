package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int end = Math.min(first, second);
        int gcd = 1;
        if (end == 0) {
            gcd = Math.max(first, second);
        }
        for (int i = 2; i <= end; i++) {
            if ((first % i == 0) && (second % i == 0)) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
