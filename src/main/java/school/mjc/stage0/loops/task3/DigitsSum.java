package school.mjc.stage0.loops.task3;


public class DigitsSum {
    public void printDigitsSum(int t){
        String a = String.valueOf(t);
        int result  = 0;

        for (int i = 0; i<=a.length()-1; i++){
            result += a.charAt(i) - '0';

        }
        System.out.println(result);
    }
}
