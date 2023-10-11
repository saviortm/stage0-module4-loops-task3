package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int num = 9, sum = 0;
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            sum += num;
            num = (int) Math.pow(10, i) * 9 + num;
        }
        System.out.println(sum);
    }
}
