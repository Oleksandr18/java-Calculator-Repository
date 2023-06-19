package java_Git_Lab3_6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        if (args.length >= 3) {
            new MyCalculator(Double.valueOf(args[0]), args[1],
                    Double.valueOf(args[2]));
        } else {
            System.out.println("Enter parameters like this: 1 + 1");
            return;
        }
    }

}