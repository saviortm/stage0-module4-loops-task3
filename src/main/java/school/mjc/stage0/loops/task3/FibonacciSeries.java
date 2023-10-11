package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first = 0, second = 1, result;
        if(lastFibonacci>1) {
            System.out.println(first);
            System.out.println(second);
            for(int i = 2; i< lastFibonacci; i++) {
                result = first+second;
                first = second;
                second = result;
                System.out.println(result);
            }
        } else if (lastFibonacci == 1) {
            System.out.println(first);
        }
    }
}
