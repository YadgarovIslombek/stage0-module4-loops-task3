package school.mjc.stage0.loops.task3;
import java.util.Scanner;
public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int f1 = 1;
        int f2 = 1;
        int f3;
        System.out.print(f1  + " " + f2 + " ");
        for (int i = 3; i <= lastFibonacci; i++){
            f3 = f1+f2;
            System.out.print(f3 + " ");
            f1 = f2;
            f2 = f3;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        FibonacciSeries ff = new FibonacciSeries();
        ff.printFibonacci(a);
    }
}
