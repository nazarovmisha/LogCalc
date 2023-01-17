import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.Scanner;

public class CalcLogg {
    private static final Logger log = LogManager.getLogger(CalcLogg.class);
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int i = sc.nextInt();
        log.info("Enter first num" + i);
        int j = sc.nextInt();
        log.info("Enter second num" + i);
        String result = sc.next();
        log.info("Enter operator" + result);

        switch (result) {
            case "+" -> i += j;
            case "-" -> i -= j;
            case "*" -> i *= j;
            case "/" -> {
                if (j == 0) {
                    log.fatal("can't divide by zero");
                    i = 0;
                } else {
                    i /= j;
                }
            }
        }
        log.info("Result " + i);
        System.out.println(i);

    }

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static int getSub(int a, int b) {
        return a - b;
    }

    public static int getMultiple(int a, int b) {
        return a * b;
    }

    public static int getDivide(int a, int b) {
        return a / b;
    }

}
